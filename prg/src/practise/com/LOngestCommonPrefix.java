package practise.com;

import java.util.Arrays;

public class LOngestCommonPrefix {
		public static void main(String args[]){
			String strs[] = {"VIVEK","VIBHOR","VIV"};
			StringBuilder result = new StringBuilder();
	        if (strs!= null && strs.length > 0){
	        
	            Arrays.sort(strs);
	            for(String tmp : strs)
	            		System.out.println(tmp);
	            
	            char [] a = strs[0].toCharArray();
	            char [] b = strs[strs.length-1].toCharArray();
	            for(char t : a)
            		System.out.println(t);
	            for(char t : b)
            		System.out.println(t);
	            
	            for (int i = 0; i < a.length; i ++){
	                if (i < b.length  && b[i] == a[i]){
	                    result.append(b[i]);
	                }
	                else {
	                   System.out.println("1: "+result);
	                }
	            }
	            System.out.println("2: "+result);
	        }
	        
		}

}
