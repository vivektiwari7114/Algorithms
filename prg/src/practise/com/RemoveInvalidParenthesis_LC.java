package practise.com;

import java.util.ArrayList;
import java.util.List;

public class RemoveInvalidParenthesis_LC {
	public static void main(String args[]){
		String s = "()())()";
		 List<String> ans = new ArrayList<>();
		    remove(s, ans, 0, 0, new char[]{'(', ')'});	
	}
	
	public static  void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
		// System.out.println(" String original: "+ s);
	    for (int stack = 0, i = last_i; i < s.length(); ++i) {
	    	//System.out.println("I: "+i);
	    	//System.out.println("Last_i: "+last_i);
	    	System.out.println(" String original: "+ s);
	    	System.out.println(" I: "+ i);
	        if (s.charAt(i) == par[0]) stack++;
	        if (s.charAt(i) == par[1]) stack--;
	        if (stack >= 0) continue;
	    	
	        for (int j = last_j; j <= i; ++j){
	        	//System.out.println("J: "+j);
	        	
	            if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
	                remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
	        }
	        return;
	    }
	    
	    String reversed = new StringBuilder(s).reverse().toString();
	    
	    //System.out.println("Reversed String");
	   // System.out.println("Reversed String original: "+ s);
	    //System.out.println("Reversed String Value: "+ reversed);
	    if (par[0] == '(') {
	    	System.out.println("par[0]");
	        remove(reversed, ans, 0, 0, new char[]{')', '('});
	        
	    }
	    else {
	    	//System.out.println("par[1]");
	        ans.add(reversed);
	    }
	}
}
