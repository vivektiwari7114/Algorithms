package practise.com;

/*Find out the max subarray sum in an array
 * Parameters: NA
 * Return :NA
 * Function:Kadence's Algorithm
 */
public class MaximumSubarrayProblem {
	public static void main(String args[]){
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int l = nums.length;
		int max = 0;
		int res = Integer.MIN_VALUE;
		int a[] = new int[l+1];
		a[0] = 0;
		
		for(int i=0; i < l ; i++){
			a[i+1]= Math.max(nums[i], nums[i] +a[i]);
			res = Math.max(res, a[i+1]);
			
			
		}
		System.out.println(res);
		
	}
}
