package practise.com;

public class LogestCommonSubstring {
	public static void main(String args[]){
		//This program can be used to identify longest Common substring and also longest commmon palindrome subsequence 
		String s = "abba";
		String t = new StringBuilder(s).reverse().toString();
		int l = s.length();
		int max = 0;
		int matrix [][] = new int[l][l];
		
		for(int i=0 ; i < l ; i++){
			for(int j =0 ;j< l ; j++){
				if(s.charAt(i) == t.charAt(j) && (i==0 || j== 0) )
						matrix[i][j] = 1;
				else if(s.charAt(i) == t.charAt(j))
						matrix[i][j] = matrix[i-1][j-1] + 1;
				else 
						matrix[i][j] = 0;
						
			}
		}
		int iIndex = 0;
		int jIndex = 0;
		for(int i =0 ;i < l; i++){
			for (int j =0 ; j< l; j++){
				if(max <= matrix[i][j]){
						max = matrix[i][j];
						iIndex = i;
						jIndex = j;
						}
				}
		}
		StringBuilder str = new StringBuilder("");
		while(max >= 1){
			str.append(s.charAt(iIndex));
			iIndex--;
			jIndex--;
			max --;
		}
		
		
		System.out.println(str);
		
		
		
	}
}
