package practise.com;

import java.util.HashSet;
import java.util.Set;

/* Name: Frog Question
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Given a River and a Frog find the time at which it will reach the Bank
 */
public class Frog {
	public static void main(String args[]){
		int X = 5;
		int a[] = {1,2,3,4,1,5,1,1,1,1,2,5,5,5,5};
		
		Set<Integer> st = new HashSet<Integer>();
		
		for(int i =0 ; i< a.length;i++){
			if(!st.contains(a[i])){
				st.add(a[i]);
				X--;
			}
			if(X == 0){
				System.out.println("Final Answer: "+i);
				System.exit(0);
			}
		}
		
		System.out.println("Final Answer: -1");
		
	}

}
