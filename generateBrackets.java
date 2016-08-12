package practise.com;

import java.util.ArrayList;
import java.util.List;

public class generateBrackets {
	public static void main(String args[]){
		int n  = 3;
		List<String> lt = new ArrayList<String>();
		StringBuffer sb = new StringBuffer("");
		helper(lt, sb, n , n);
		System.out.println(lt);
	}
	/* Name: Generate Curly braces
	 * Parameters: List of String, Stringbuffer Variable, Left Counter, Right Counter
	 * Return :Void
	 * Function: Generate Balanced Curly brackets
	 */
public static void helper (List<String> lt, StringBuffer s, int left, int right){
	if(left > right)
			return ;
	
	if(left == 0 && right ==0){
		lt.add(s.toString());
		return ;
	}
	if(left > 0){
		
		helper(lt,s.append("("),left-1, right);
		s.deleteCharAt(s.length() - 1);
	}
	if(right > 0){
		
		helper(lt,s.append(")"),left, right -1);
		s.deleteCharAt(s.length() - 1);
	}
	
	
	}
}
