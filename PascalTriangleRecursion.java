package practise.com;

import java.util.ArrayList;
import java.util.List;

/* Class Name: Implement Pascal triangle using recusrion
 * Parameters: NA
 * Function:  Create a Pascal triangle using recusrion
 */
public class PascalTriangleRecursion {
		public static void main(String args[]){
			int n = 5;
			List<Integer> pre = new ArrayList<Integer>();
			List<List<Integer>> res  = new ArrayList<List<Integer>>();
			
			new PascalTriangleRecursion().generatePascal(pre, res, n);
			System.out.println(res);
			
		}
public void generatePascal(List<Integer> pre, List<List<Integer>> res , int n){
	if(n == 1){
		pre.add(1);
		res.add(new ArrayList(pre));
		return;
	}else{
		generatePascal(pre, res, n-1);
		List<Integer> curr = new ArrayList<Integer>();
		curr.add(1);
		for(int i = 0; i < pre.size() - 1; i++)
				curr.add(pre.get(i)  + pre.get(i+1));
		curr.add(1);
		pre.clear();
		for(Integer t: curr)
				pre.add(t);
		res.add(curr);
	}
}
}
