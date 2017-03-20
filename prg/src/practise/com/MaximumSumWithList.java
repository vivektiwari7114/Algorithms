package practise.com;
import java.util.*;

/**
 

* ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */


/**
 * @author VivekTiwari
 *
 */
public class MaximumSumWithList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,-4,3,6,-9};
		
		List<Integer> res = new ArrayList<Integer>();
		
		int max = Integer.MAX_VALUE;
		int sum = arr[0];
		res.add(arr[0]);
		for (int i=1; i < arr.length; i++){
			int prev = sum;
			sum = Math.max(prev + arr[i], arr[i]);
			
			max = Math.max(sum, max);
			if(max ==prev + arr[i] )
				res.add(arr[i]);
		else{
			res.clear();
			res.add(arr[i]);
		}
		}
		
	}

}
