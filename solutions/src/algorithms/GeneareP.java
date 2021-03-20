package practise.com;

import java.util.ArrayList;
import java.util.List;

public class GeneareP {
	public static void main(String args[]){
	
	List<List<String>> result = new ArrayList<List<String>>();
	List<String> temp = new ArrayList<String>();
	int n = 2;
	//String str = "";
	
	generateAllParenthesis(result, temp, n, n);
	System.out.println(result);
	}
public static  void generateAllParenthesis(List<List<String>> result, List<String> curr , int left, int right){
	if(left > right)
		return;
	
	if(left ==0 && right == 0){
		result.add(new ArrayList(curr));
		
		return;
	}
	if(left != 0){
		curr.add("(");
		//List<String> temp = new ArrayList<String>(curr);
		generateAllParenthesis(result, curr, left -1 , right);
		curr.remove(curr.size() - 1);
		//curr.remove(curr.size() - 1);
	}
	
	//curr.remove(curr.size() - 1);
	if(right != 0){
		curr.add(")");
		//List<String> temp = new ArrayList<String>(curr);
		generateAllParenthesis(result, curr, left , right - 1);
		curr.remove(curr.size() - 1);
		//curr.remove(curr.size() - 1);
		
	}
}
}
