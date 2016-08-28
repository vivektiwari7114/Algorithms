package practise.com;

import java.util.ArrayList;
import java.util.List;

/* Name:Search Range
 * Parameters: List of String, Stringbuffer Variable, Left Counter, Right Counter
 * Return :Void
 * Function:Search  given element in the range
 */
public class SearchRange {
	public static void main(String args[]){
		int nums[] = {2,2};
		int target = 3;
		
		List<Integer> t = new ArrayList<Integer>();
		callback(0,nums.length, target,nums,t);
		if(t.size() == 0){
			System.out.println("Exit");
			System.exit(0);
		}
		int a[] = new int[t.size()];
		for(int i=0; i< t.size(); i++){
			a[i] = t.get(i);
		}
		for(int k: a)
				System.out.print(k+" ");
		
	}
	public static void  callback(int start , int end,int target, int[] nums, List<Integer> t){
		System.out.println("Start "+start+ " End "+end);
		int mid = (start+ end)/2;
		
		
		if(mid < 0 || mid >=nums.length)
				return;
		if(target > nums[mid])
			callback(mid+1, end, target, nums,t);
		else if(target < nums[mid])
			callback(start, mid - 1, target, nums,t);
		else{
			//System.out.println("Nums "+nums[mid]);
			//System.out.println("Target "+target);
			int j =0;
			while (mid < nums.length && nums[mid] == target ){
				
				t.add(mid);
				mid++;
				}
			}
		}
}
