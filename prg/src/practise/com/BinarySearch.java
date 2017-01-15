package practise.com;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String args[]){
	// Given Input
	int nums[]= {3,1};
	int target = 1;
	int low = 0;
	int high = nums.length -1;
	Arrays.sort(nums);
	int num = binarySearch(low,high,nums,target);
	// -1 depicts not found and other values depict that element is found
	System.out.println(num);
	}
	/* Name: binarySearch
	 * Parameters: Low Counter, High Counter, Integer Array, Target
	 * Return :Void
	 * Function: Find Given Element using binary Search
	 */
	public static int binarySearch(int low, int high, int[] nums, int target){
		if(low > high)
				return -1;
		int mid = low + ((high-low)/2);
		if(target > nums[mid])
			return binarySearch(mid+1,high,nums,target);
		else if(target < nums[mid])
			return binarySearch(low,mid -1,nums,target);
		else{
			//System.out.println("Result: "+mid);
			return mid;
		}
	}
}
