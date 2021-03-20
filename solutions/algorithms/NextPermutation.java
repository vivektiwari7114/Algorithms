package practise.com;

import java.util.Arrays;

public class NextPermutation {
	public static void main(String args[]){
		int nums[] = {2,3,1,3,3};
		int l = nums.length;
		boolean flag = true;
		int val=0,index=0, max = Integer.MAX_VALUE, sIndex =0;
		for(int i = l-1; i >0; i--){
			if(nums[i-1] < nums[i]){
				val = nums[i-1];
				index = i-1;
				flag = false;
				break;
				}
			}
		if(flag){
			Arrays.sort(nums);
			for(int k : nums)
				System.out.print(k+" ");
			return;
		}
		for(int i = index+1; i < l; i++){
			if(nums[i] >val && max >=nums[i]  ){
				max = nums[i];
				sIndex = i;
			}
		}
		swap(nums, index, sIndex);
		reverse(nums, index, l);
		
		for(int k : nums)
				System.out.print(k+" ");
	}
	public static void swap(int[] nums, int index, int sIndex){
		int temp = nums[index];
		nums[index] = nums[sIndex];
		nums[sIndex] = temp;
		
	}
	public static void reverse(int[] nums, int index, int l){
		int i = index +1;
		int j = l-1;
		while(i < j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		
	}

}
