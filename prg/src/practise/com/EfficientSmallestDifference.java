package practise.com;

import java.util.Arrays;

/* Name: Smallest Difference
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Find Smallest difference
 */
public class EfficientSmallestDifference {
	public static void main(String args[]){
		int num1[] = {1,2,3,11,15};
		int num2[] ={235,127,8,19,23};
		int l1 = num1.length;
		int l2 = num2.length;
		
		Arrays.sort(num1);
		Arrays.sort(num2);
		int diff = Integer.MAX_VALUE;
		int i =0; 
		int j=0;
		
		while(i < l1 && j < l2){
			int min = Math.abs(num1[i]- num2[j]);
				if(diff > min)
						diff = min;
			if(num1[i] > num2[j])
				j++;
			else
				i++;
		}
		System.out.println(diff);
	}
	

}
