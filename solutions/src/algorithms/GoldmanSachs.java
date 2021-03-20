package practise.com;
import java.util.ArrayList;
import java.util.*;

public class GoldmanSachs {

	public static void main(String[] args) {
		
		printCombinations(5,3);
		

	}
	
	////generates all permutations of an arraylist of numbers
	///Input: a combination of "A" numbers from the array [1,B]
	///Output: all permutations of this array
	public static List<List<Integer>> listPermutations(List<Integer> list) {

	    if (list.size() == 0) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        result.add(new ArrayList<Integer>());
	        return result;
	    }

	    List<List<Integer>> returnMe = new ArrayList<List<Integer>>();

	    Integer firstElement = list.remove(0);

	    List<List<Integer>> recursiveReturn = listPermutations(list);
	    for (List<Integer> li : recursiveReturn) {

	        for (int index = 0; index <= li.size(); index++) {
	            List<Integer> temp = new ArrayList<Integer>(li);
	            temp.add(index, firstElement);
	            returnMe.add(temp);
	        }

	    }
	    return returnMe;
	}
	
	
	////generates all binary strings of length B with "A" bits set
	////the combination corresponding to the set bits in the array is taken and permutation of that array is generated
	
	///Input: a combination of "A" numbers from the array [1,B]
	///Output: all permutations of this array
	public static void printCombinations(int B, int A)
	{
		////generate actualArray having elements [1,B]
		int actualArray[] = new int[B];
		for (int i=0;i<B;i++)
			actualArray[i]=i+1;
		
		
		///generate first binary string of size B of the form 00001111 where A bits are 1 and they are at the extreme right
		int tempvec[] = new int[B];
		for (int i=0;i<B;i++)
		{
			if (i>B-1-A)
				tempvec[i]=1;
			else
				tempvec[i]=0;
		}
		
		
		///end variable signifies if there are no additional binary strings left
		boolean end = false;
		
		///while there are more binary strings left...i.e., there are more possible combinations
		
		////basically, this code generates all possible binary arrays of length B in which A bits are set..it iterates over all such strings
		////for each string...it picks the corresponding elements from the actualArray [1,B] and then generates all the permutations of that array
		
		while(!end)
		{
			///copying tempvec into new array
			int newvec[] = new int[B];
			for (int i=0;i<B;i++)
			{
				newvec[i] = tempvec[i];
			}
			
			///create appropriate combination from the acutalArray of elements [1,B] and store them in arrayList
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for (int i=0;i<newvec.length;i++)
			{
				if (newvec[i]==1)
					arrayList.add(actualArray[i]);
			}
			
			///create permuations of arrayList and print them
			List<List<Integer>> fin = new ArrayList<List<Integer>>();
			
			fin = listPermutations(arrayList);
			for(List<Integer> t: fin)
					System.out.println(t);
			
			
			//this piece of code finds the next biggest binary string of length B having A bits set
			boolean nextPresent = false;
			for (int i=tempvec.length-1;i>=1;i--)
			{
				///find rightmost "01"
				if (tempvec[i]==1&&tempvec[i-1]==0)
				{
					nextPresent  =true;
					////convert it to "10"
					tempvec[i]=0;
					tempvec[i-1]=1;
					int numOnesAfterPoint = 0;
					
					
					///move all 1's to the right of this point (i.e., the location of the rightmost "01") to the extreme right of the binary array
					for (int j=i+1;j<tempvec.length;j++)
					{
						if (tempvec[j]==1)
							numOnesAfterPoint++;
					}
					
					
					//numOnesAfterPoint has the number of 1's to the right of this point
					for (int j=tempvec.length-1;j>=i+1;j--)
					{
						if (numOnesAfterPoint>0)
						{
							tempvec[j]=1;
							numOnesAfterPoint--;
						}
						else
							tempvec[j]=0;
					}
					break;
				}
				else
					continue;
			}
			
			////we have no more possible combinations...end loop
			if (!nextPresent)
				end=true;
		}
	}
	

}
