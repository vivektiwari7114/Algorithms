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
public class FibonnaciSEriesRecursive {
	public static void main(String args[]){
	
			int n = 5;	
			// 1 1 2 3 5 8 13
			System.out.println( iterative(15) );
	}
	public static int series(int n ){
		if ( n == 1)
				return 0;
		if( n== 2)
			return 1;
		else
			return series(n-1) + series(n-2);
	}
	public static int iterative(int n){
		int nums[] = new int [n];
		nums[0] = 0;
		nums[1] = 1;
		
		for(int i = 2; i < n; i++)
			nums[i] = nums[i-1] + nums[i-2];
		
		return nums[n-1];
		
		
	}
}

