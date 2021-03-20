package practise.com;


/* Name: Longest Palindrome
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function:Find Longest Palindrome o(n^2)
 */
public class LongestPalindromeDP {
	public static void main(String args[]){
		String s ="banana";
		int l = s.length();
		int beginIndex = 1;
		int maxLen = 0;
		boolean table[][] = new boolean[l][l];
		
		for(int i=0; i < l; i++)
			table[i][i] = true;
		
		for(int i=0; i < l-1;i++){
			if( s.charAt(i) == s.charAt(i+1) ){
				table[i][i+1] = true;
				beginIndex = i;
				maxLen = 2;
			}
		}
		
		for(int step = 3; step <= l; step++){
			for(int j=0; j < l-step+1; j++){
				int t= j+step-1;
				if( s.charAt(j) ==  s.charAt(t) && table[j+1][t-1]){
					table[j][t] = true;
					beginIndex = j;
					maxLen = step;
				}
				
				
			}
		}
		System.out.println(maxLen);
		System.out.println(s.substring(beginIndex, maxLen+1));
	}

}
