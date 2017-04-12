/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

import java.util.*;
import java.util.List;

/**
 * @author VivekTiwari
 *
 */
public class TargetSumWithOperators {
	private static int count = 0;
	public static void main(String args[]){
		
		int a[] = {1,1,1};
		int target = 1;
		//List<List<Integer>> fin = new ArrayList<List<Integer>>();
		List<Integer> res = new ArrayList<Integer>();
		findTargetSum(a,target, 0, 0);
		System.out.println(count);
	}

public static void findTargetSum(int [] a, int target, int step, int sum){
	//System.out.println("Step "+step);
	//System.out.println("Sum "+sum);
	if(sum == target  && step == a.length){
			count ++;
	}

		
	if(step >= a.length)
			return ;
	findTargetSum(a, target, step + 1, sum + a[step]);
	findTargetSum(a, target, step + 1, sum - a[step]);
		
	
	
	}
}
