/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;
import java.util.*;

/**
 * @author VivekTiwari
 *
 */
public class validWordSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List<String> store = new ArrayList<String>();
	store.add("code");
	store.add("odef");
	store.add("defg");
	store.add("efgh");
	
	
	System.out.println( validWordSquare(store) );

	}
	 public static boolean validWordSquare(List<String> words) {
	        
		 
		 /*if(words == null || words.size() == 0){
	            return true;
	        }
	        int n = words.size();
	        for(int i=0; i<n; i++){
	        	System.out.println("i "+i);
	            for(int j=0; j<words.get(i).length(); j++){
	            	System.out.println("j" +j);
	                if(j >= n || words.get(j).length() <= i || words.get(j).charAt(i) != words.get(i).charAt(j))
	                    return false;
	            }
	        }
	        return true;
	    } */
		 
		 
		int maxLen = 0;
		
		for(String str : words)
		{
			maxLen = Math.max(maxLen, str.length());
		}
		
		for(int i = 0; i < maxLen; ++i)
		{
			if(!getColumnString(words, i).equals(getRowString(words, i)))
				return false;
		}
		
		return true;
	 }
	 /**
		 * @param words
		 * @param i
		 * @return
		 */
		private static Object getColumnString(List<String> words, int i) 
		{
			StringBuffer sbuff = new StringBuffer();
			
			for(int listLen = 0; listLen < words.size(); ++listLen)
			{
				if(words.get(listLen).length() > i)
					sbuff.append(words.get(listLen).charAt(i));
			}
			
			return sbuff.toString();
		}
		/**
		 * @param words
		 * @param i
		 * @return
		 */
		private static String getRowString(List<String> words, int i) 
		{
			if(i < words.size())
				return words.get(i);
			else
				return null;
		}

}
	
