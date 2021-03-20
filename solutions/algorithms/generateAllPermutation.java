package practise.com;

import java.util.ArrayList;
import java.util.List;


/* Name: Generate all permutation of the given string
 * Parameters: NA
 * Return :Void
 * Function: Generate all Permutations
 */
public class generateAllPermutation {
	public static void main(String args[]){
		String str = "abcd";
		int count[] = {1,1,1,1};
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<String>();
		
		getAllPermutations(result, count,str, 0,temp);
		System.out.println(result);
		
		
	}
	public static void getAllPermutations(	List<List<String>> result, int count[], String str, int level, List<String> temp){
		if(level == str.length()){
			result.add(new ArrayList<String>(temp));
			return;
		}
		for(int i=0; i< str.length();i++){
			if(count[i] == 0)
				continue;
			//List<String> curr = new ArrayList<String>();
			temp.add(str.charAt(i)+"");
			count[i] = count[i] - 1;
			
			getAllPermutations(result, count, str, level + 1, temp);
			temp.remove(temp.size() - 1);
			count[i] = count[i] + 1;
		}
	}

}
