package practise.com;

import java.util.Arrays;

public class RemoveDuplicateWithoutAdditionalMemory {
	public static void main(String args[]){
		int nums[] = {1,3,2};
		int l = nums.length;
		int index = 0;
		int min = Integer.MAX_VALUE;;
		for(int i =0; i < l-1;i++){
			
			for(int j=i+1; j<l;j++){
				if(min > nums[j]){
					min = nums[j];
					index = j;
				}
			}
			System.out.println("Swapiing Values  "+nums[i] +" "+nums[index]+" "+min);
			if( min > nums[i] ){
				
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
			}
			min = Integer.MAX_VALUE;
			
			
		}
		System.out.println("Hello");
		for(int k : nums)
			System.out.print(k+" ");
		
	}

}
