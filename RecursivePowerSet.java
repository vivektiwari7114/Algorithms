package practise.com;

import java.util.List;
import java.util.ArrayList;

public class RecursivePowerSet {
	public static void main(String args[]){
		//System.out.println("Hello");
		int nums[] = {};
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getAllSubsets(result, nums, 0);
		System.out.println("result is : "+result);
		
	}
	public static void getAllSubsets(List<List<Integer>> result, int nums[], int i){
		//System.out.println("Value of i "+ i);
		if( i >= nums.length){
			System.out.println("Hello");
			List<Integer> empty = new ArrayList<Integer>();
			result.add(empty);
				return;
		}
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		//System.out.println("Temp1 "+temp);
		//System.out.println("result1 "+result);
		for(List<Integer> t : result)
				temp.add(new ArrayList(t));
		//System.out.println("Temp2 "+temp);
		//System.out.println("result2 "+result);
		
		for(List<Integer> tmp: temp)
				tmp.add(nums[i]);
		//System.out.println("Temp3 "+temp);
		//System.out.println("result3 "+result);
		
		List<Integer> single =  new ArrayList<Integer>();
		single .add(nums[i]);
		temp.add(single);
		result.addAll(temp);
		i=i+1;
		getAllSubsets(result,nums,i);
		
		
	}

}
