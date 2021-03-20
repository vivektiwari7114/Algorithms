package practise.com;

import java.util.HashSet;
import java.util.Set;

/* Bounded Word Composition: Brute Force 
 * Parameters: NA
 * Return :NA
 * Function:To find whether the given string composed of words that are present in the dictionary
 */
public class WordComposition {
	public static void main(String args []){
		
		String s = "catdogcats";
		Set<String> st = new HashSet<String>();
		st.add("cat");st.add("vivek");st.add("cats");st.add("dog");
		System.out.println(checkHelper(s, st, 0));
	}
	public static boolean checkHelper(String s , Set<String>st, int start){
		if(start == s.length())
				return true;
		
	for(String temp : st){
		int len = temp.length();
		int end = start + len;
		if(end > s.length())
				continue;
		if(s.substring(start, end).equals(temp)){
			if(checkHelper(s, st, end))
					return true;
		}
	}
	return false;
		
	}

}
