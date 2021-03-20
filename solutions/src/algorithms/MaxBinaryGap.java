package practise.com;

/* Name: MAx Binary Gap
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Find the most number of Occurence of consecutive 0's in O(log n) complexity
 */
public class MaxBinaryGap {
		public static void main(String args[]){
			int  N = 1;
			
			int count = -1;
		       int max = 0;
		       while(N > 0){
		           int r = N & 1;
		           N = N >>1;
		           
		           if( r == 0 && count >= 0){
		               count = count + 1;
		           }
		           if(r == 1){
		               max = count > max ? count : max;
		               count = 0;
		           }
		       }
		      System.out.println(max);
			
		}

}
