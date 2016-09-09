package practise.com;



public class BinarySearch {
	public static void main(String args[]){
	// Given Input
	int nums[]= {5,5,5,5,5,5};
	int target = 5;
	int low = 0;
	int high = nums.length -1;
	binarySearch(low,high,nums,target);
	}
	/* Name: binarySearch
	 * Parameters: Low Counter, High Counter, Integer Array, Target
	 * Return :Void
	 * Function: Find Given Element using binary Search
	 */
	public static void binarySearch(int low, int high, int[] nums, int target){
		if(low > high)
				return ;
		int mid = low + ((high-low)/2);
		if(target > nums[mid])
			binarySearch(mid+1,high,nums,target);
		else if(target < nums[mid])
			binarySearch(low,mid -1,nums,target);
		else{
			System.out.println("Result: "+mid);
			System.exit(0);
		}
	}
}
