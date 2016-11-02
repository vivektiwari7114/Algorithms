package practise.com;

import java.util.*;
public class Permutation {

	public static void main(String[] args) {
	 int nums[] = {1,2,3};
	 
	 if (nums == null || nums.length == 0)
		 	return ;
	 int l = nums.length;
	 int count[] = new int[l];
	 for(int i=0; i < l;i++)
		 count[i] = 1;
	 List<List<Integer>> res = new ArrayList<List<Integer>>();
	 List<Integer> temp = new ArrayList<Integer>();
	 
	 getPermutation(res, nums, count, temp);
	 	System.out.println(res);

	}
	public static void getPermutation(List<List<Integer>> res, int nums[], int count[], List<Integer> temp){
		if(temp.size() == nums.length){
			res.add(new ArrayList<Integer>(temp));
			//System.out.println(res);
			return;
		}
		for(int i=0; i < nums.length; i++){
			if(count[i] == 0)
					continue;
			temp.add(nums[i]);
			count[i] = count[i] - 1;
			//List<Integer> td = new ArrayList<Integer>(temp);
			getPermutation(res, nums, count, temp);
			temp.remove(temp.size() - 1);
			count[i] = count[i] + 1;
		}
	}

}
