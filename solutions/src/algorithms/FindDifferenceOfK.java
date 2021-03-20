package practise.com;

import java.util.HashSet;
import java.util.Set;

public class FindDifferenceOfK {
	public static void main(String args[]){
		int input[] = {1,5,3,4,2};
		int k = 10;
		
		
		Set<Integer> st = new HashSet<Integer>();
		
		for(int i=0; i < input.length; i++){
			st.add(input[i]);
		}
		int count =0;
		for(int i=0; i < input.length; i++){
			if( st.contains(input[i] + k) || st.contains(input[i] - k) ){
				count ++;
				st.remove(input[i]);
				
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}
