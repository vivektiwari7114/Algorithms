package practise.com;

public class longestPalindrome {
	public static void main(String args[]){
		StringBuffer s = new StringBuffer("aba");
		int l = s.length();
		int ans = 0;
		StringBuffer finalString = new StringBuffer("");
		for(int i = 0; i< l; i++){
			for(int j = i + 1 ; j <= l;j++){
				boolean status = checkString(s, i , j);
				if( status  && ans < s.substring(i, j).length() ){
					ans =  s.substring(i, j).length();
					finalString = new StringBuffer( s.substring(i, j) );
				}
			}
		}
		
		System.out.println("Length: "+ ans +" String: "+finalString);
	}
	public static boolean checkString(StringBuffer s , int start, int end){
		
		StringBuffer s1  = new StringBuffer( s.substring(start, end) );
		StringBuffer rev   = s1.reverse();
		int l = s1.length();
		for(int i = 0, j = l-1; i < l/2; i++, j--){
			if(s1.charAt(i) != rev.charAt(j))	
					return false;
		}
		return true;
	}

}
