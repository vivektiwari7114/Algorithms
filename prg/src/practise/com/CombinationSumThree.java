package practise.com;
import java.util.*;

/* Name: Combination Sum with any target sum and number of elements
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Combination Sum with any target sum and number of elements
 */
public class CombinationSumThree {
	public static void main(String args[]){
    int nums[] = {1,2,3,4,5,6,7,8,9};
    int k = 9;
    List<Integer> temp = new ArrayList<Integer>();
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	Arrays.sort(nums);
	calculateSum(temp, result, k, nums, 0);
	System.out.println(result);
    
}
public static void  calculateSum(List<Integer> temp, List<List<Integer>> result , int target, int nums[], int index){
	List<Integer> t = new ArrayList<Integer>(temp);
	if(index >= nums.length || nums[index] > target ){
		return ;
	}else if(nums[index] < target){
		 t.add(nums[index]);
		 calculateSum(t, result, target - nums[index], nums, index+1);
		 t.remove(t.size() - 1);
		 calculateSum(t , result, target , nums, index + 1);
		 return;
	}else{
	   
		t.add(nums[index]);
	if(t.size() == 3)
		result.add(t);
		
    	return ;
	}

	}
}
