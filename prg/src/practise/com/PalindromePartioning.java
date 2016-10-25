package practise.com;

import java.util.ArrayList;

public class PalindromePartioning {
	public static void main(String args[]){
		String s = "aab";
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>(0);
		int step =1;
		int l = s.length();
		while(step <= l){
			ArrayList<String> temp = new ArrayList<String>();
				int i=0;
			for(i=0; i +step <= l; i= i+step){
				String t = s.substring(i, step + i);
				if(checkPalindrome(t)){
					temp.add(t);
					
				}
			}
			if(i < l){
				if(checkPalindrome(s.substring(i,l)))
					temp.add(s.substring(i,l));
			}
			if( temp.size()  != 0 ) 
				res.add(temp);
			step++;
		}
		System.out.println(res);
		
	}
	public static boolean checkPalindrome(String s){
		int i=0;
		int j = s.length() - 1;
		for(; i< j; i++, j--){
			if( s.charAt(i) != s.charAt(j) )
				return false;
		}
		return true;
	}

}
