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
public class TargetSum {
	private static int count =0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{1,1,1,1,1};
		int target = 3;
		getCombination(a, target, 0, 0);
		System.out.println(count);
		

	}
	public static void getCombination(int[] a,  int target, int sum, int step ){
		System.out.println("Sum "+sum);
		
		if (sum == target){
			System.out.println("Hello");
			count++;
			return;
		}
		if(sum > target || step >= a.length)
			return ;
		else{
			getCombination(a, target, sum + a[step], step + 1);
			getCombination(a, target, sum - a[step], step + 1);
		}
		
	}

}
