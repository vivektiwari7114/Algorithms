package practise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/* Name: Power Set
 * Parameters: NA
 * Return :Void
 * Function:  Calculate Power Set
 */

public class PowerSet {
	public static void main(String args[]){
		int s[] = {1,2,3};
		
		Set<List<Integer>> result = new HashSet<List<Integer>>();
		
		
		for(int i=0; i< s.length; i++){
			
			Set<List<Integer>> temp = new HashSet<List<Integer>>();
			
			for(List<Integer> t : result)
				 temp.add(new ArrayList<Integer>(t));
			for(List<Integer> t : temp)
				t.add(s[i]);
			
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(s[i]);
			temp.add(tmp);
			result.addAll(temp);
			//System.out.println(result);
			
			
		}
		result.add(new ArrayList<Integer>());
		//System.out.println(result);
		System.out.println(result);
		
	}

}
