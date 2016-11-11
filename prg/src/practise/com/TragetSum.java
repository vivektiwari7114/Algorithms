package practise.com;
import java.util.*;

public class TragetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,-1,2,1};
		int k = 1;
		
		 if (nums == null || nums.length == 0)
	            return;
	        int n = nums.length;
	        for (int i = 1; i < n; i++)
	            nums[i] += nums[i - 1];
	       /* for(int x : nums)
	        		System.out.println(x + " ");*/
	        Map<Integer, Integer> map = new HashMap<>();
	        map.put(0, -1); // add this fake entry to make sum from 0 to j consistent
	        int max = 0;
	        for (int i = 0; i < n; i++) {
	            if (map.containsKey(nums[i] - k))
	                max = Math.max(max, i - map.get(nums[i] - k));
	            if (!map.containsKey(nums[i])) // keep only 1st duplicate as we want first index as left as possible
	                map.put(nums[i], i);
	        }
	        System.out.println( max ); 

	}

}
