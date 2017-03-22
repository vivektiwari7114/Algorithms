/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

/**
 * @author VivekTiwari
 *
 */
public class Kadanes {
	public static void main(String args[]){
		int a[] = {};
		
		int currSum =0, max = Integer.MIN_VALUE;
		int start = 0, end =0;
		for(int i=0; i < a.length; i++){
			currSum += a[i];
			currSum = Math.max(currSum, a[i]);
			if(currSum == a[i])
				start = i;
			
			if(max < currSum){
				max = currSum;
				end = i;
			}
			
		}
		System.out.println("Start "+ start + " ENd "+ end);
		
		
	}

}
