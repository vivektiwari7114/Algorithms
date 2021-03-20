package practise.com;

import java.util.Arrays;

public class LOngestCommonPrefix {
		public static void main(String args[]){
			String strs[] = {"aab","aac","aad"};
			if (strs.length < 1 || strs == null) {
	            return;
	        }
	        if (strs.length == 1) {
	            return;
	        }
	        //find the shortest String
	        int shortest = 0;
	        int len = strs[0].length();
	        for (int i = 1; i < strs.length; i++) {
	            int curLen = strs[i].length();
	            if (curLen < len) {
	                len = curLen;
	                shortest = i;
	            }
	        }
	        
	        //find the longest common prefix
	        
	        String sub = strs[shortest];
	        System.out.println("Length of sub: "+sub);
	        for (int i = 0; i < strs.length; i++) {
	        	
	        	System.out.println( "Result of "+ (strs[i].indexOf(sub) ));
	            while (strs[i].indexOf(sub) != 0) {
	                sub = sub.substring(0, sub.length()-1);
	                System.out.println("Sub "+sub);
	                
	            }
	        } 
	        
	        System.out.println("Result "+sub);
	        
		}

}
