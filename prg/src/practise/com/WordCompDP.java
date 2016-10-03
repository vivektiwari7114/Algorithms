package practise.com;

import java.util.HashSet;
import java.util.Set;

public class WordCompDP {
	public static void main(String args[]){
		String s = "catdogcats";
		Set<String> st = new HashSet<String>();
		st.add("cat");st.add("vivek");st.add("cats");st.add("dog");
		System.out.println(checkHelper(s, st));
	}
	public static boolean checkHelper(String s , Set<String>st){
		boolean check[] = new boolean[s.length() + 1];
		check[0] = true;
		
		for(int i=0; i < check.length; i++){
			if(!check[i])
				continue;
			
			for (String str : st){
				int l = str.length();
				int end  = i+l;
				if(end > s.length ())
						continue;
				
				if(s.substring(i, end).equals(str))
						check[end] = true;
					
			}
		}
		return check[check.length - 1];

	}


}
