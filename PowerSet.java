package practise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/* Name:Power Set
 * Parameters: List of String, Stringbuffer Variable, Left Counter, Right Counter
 * Return :Void
 * Function: Implement Power Set of given set
 */
public class PowerSet {
	public static void main(String args[]){
		int s[] = {1,2};
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		
		for(int i=0; i< s.length; i++){
			//System.out.println("fr "+result);
			List<List<Integer>> temp = new ArrayList<List<Integer>>();
			//System.out.println("fr2 "+result);
			for(List<Integer> t : result)
				 temp.add(new ArrayList<Integer>(t));
			for(List<Integer> t : temp)
				t.add(s[i]);
			//System.out.println("fr3 "+result);
			//System.out.println("Temp "+temp);
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(s[i]);
			temp.add(tmp);
			result.addAll(temp);
			//System.out.println("temp "+temp);
			//System.out.println("result "+result);
			
		}
		result.add(new ArrayList<Integer>());
		System.out.println(result);
		
		
	}

}
