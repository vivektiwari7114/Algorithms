package practise.com;

import java.util.Arrays;

/* Name: Return Minimum positive difference between two arrays
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Minimum difference between two arrays
 */
public class EfficientMaxDifferenceInTwoArray {
		public static void main(String args[]){
			int a[] = {1,3,15,11, 2};
			int b[] = {8,19,23,127,235};
			Arrays.sort(a);
			Arrays.sort(b);
			int l1 = a.length;
			int l2 = b.length;
			
			int i=0, j=0;
			int min = Integer.MAX_VALUE;
			while( i < l1 && j < l2){
				int diff = Math.abs(a[i] - b[j]);
				if(diff < min)
						min = diff;
				if(a[i] < b[j])
						i++;
				else
					j++;
				
			}
			System.out.println(min);
		
		}

}
