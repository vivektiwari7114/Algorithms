package practise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetSUm {
	public static void main(String args[]){
		int nums[] = {10,1,2,7,6,1,5};
		int target = 8;
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		
		calculateSum(temp, result, target, nums, 0);
		System.out.println(result);
		
	}
	
	public static void  calculateSum(List<Integer> temp, List<List<Integer>> result , int target, int nums[], int index){
		System.out.println("Target: "+target + " Index: "+index   );
		List<Integer> t = new ArrayList<Integer>(temp);
		if(index >= nums.length || nums[index] > target ){
			//System.out.println("Breaking condition :"+ t);
			//System.out.println("Breaking condition array :"+ nums[index]);
			return ;
		}else if(nums[index] < target){
			
			
			//System.out.println("");
			 t.add(nums[index]);
			//System.out.println("t: "+t);
			// System.out.println("Target: "+target + " Index: "+index +"Prev "+prev  );
			 calculateSum(t, result, target - nums[index], nums, index+1);
			// System.out.println("Hello");
			 t.remove(t.size() -1 );
			
			
			// System.out.println("Temp after removing elem" + t);
			 calculateSum(t , result, target, nums, index + 1);
			 return ;
			 
		}else{
			
			t.add(nums[index]);
			result.add(t);
			//System.out.println("Value of t: "+t);
			//System.out.println("Value of Result: "+result);
			
			//temp.remove(nums[index]);
			
			
			return ;
		}
	}

}
