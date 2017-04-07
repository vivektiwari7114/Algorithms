/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

/**
 * @author VivekTiwari
 *
 */
public class RepeatedString {
	public static void main(String args[]){
		String test = "abcabcabc";
		System.out.println(checkRepeatation(test));
	}
	public static boolean checkRepeatation(String str){
		
		int len = str.length();
		for(int i=len / 2; i >= 1 ; i--){
			if(len % i == 0){
				int m = len / i;
				String subS = str.substring(0, i);
				
				StringBuilder sb = new StringBuilder();
				for(int j=0; j < m; j++)
						sb.append(subS);
				
				if(sb.toString().equals(str))
						return true;
			}
		}
		return false;
		
	}
}
