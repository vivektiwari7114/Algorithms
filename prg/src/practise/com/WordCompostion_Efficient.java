package practise.com;

import java.util.HashSet;
import java.util.Set;

public class WordCompostion_Efficient {
	public static void main(String args[]){
		String s = "catdogcats";
		Set<String> st = new HashSet<String>();
		st.add("cat");st.add("vivek");st.add("cats");st.add("dog");
		System.out.println(checkHelper(s, st));
	}
	
	public static boolean checkHelper(String s ,Set<String> st){
		boolean check[] = new boolean[s.length()+1];
		for(int i=0;i< check.length; i++)
				check[i] = false;
		check[0] = true;
		
		for(int i=0; i< check.length; i++){
			System.out.println("i :"+i);
			if(!check[i])
					continue;
			for(int j=i+1; j< check.length; j++){
				String temp = s.substring(i,j);
				System.out.println(temp);
				if(st.contains(temp)){
					System.out.println(" ::"+j);
					check[j] = true;
				}
				
				
			}
			
		}
		return check[check.length - 1];
		
	}

}
