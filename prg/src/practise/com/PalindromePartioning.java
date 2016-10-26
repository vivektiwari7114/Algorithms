package practise.com;

import java.util.ArrayList;

/* Name: Palindrome partioning
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function:Palindrome Partioning 
 */
public class PalindromePartioning {
	public static void main(String args[]){
		String s = "aab";
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>(0);
		ArrayList<String> al = new ArrayList<String>();
		helper(s, 0, al, res);
		System.out.println(res);
		
	}
	public static void helper(String s, int step, ArrayList<String> al, ArrayList<ArrayList<String>> res){
		
		if(step == s.length()){
			res.add(new ArrayList<String>(al));
			return;
		}
		StringBuilder t= new StringBuilder();
		for(int i= step; i < s.length(); i++){
			int k = i + 1;
			t.append(s.substring(i, k));
			System.out.println("T "+t);
			if(checkPalindrome(t.toString())){
				al.add(t.toString());
				helper(s, k, al, res);
				al.remove(al.size() - 1);
			}
			
			
		}
		
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
