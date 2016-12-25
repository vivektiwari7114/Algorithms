package practise.com;

import java.util.*;

public class checkWorking {
	// Replace Space with %20 
	public static void main(String args[]){
		
		int a[] = {-3, -10, -5};
		int sum = 0;
		int top = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i < a.length; i++){
			sum = sum + a[i];
			top = Math.max(sum, a[i]);
			sum = top;
			max = Math.max(max, sum);
		}
		
		System.out.println("Answer is "+max);
		
		
	

	}
}


