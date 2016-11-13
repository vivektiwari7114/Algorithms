package practise.com;

public class OneEditDistance {

	/* One Edit distance (Genetic Mutation String problem)
	 * Parameters: NA
	 * Return :NA
	 * Function:One Edit distance (Genetic Mutation String problem)
	 */
	public static void main(String[] args) {
		
		String s = "ab";
		String t = "a";
		System.out.println( getStatus(s, t) );
		
		// TODO Auto-generated method stub

	}
	public static  boolean getStatus(String s , String t){
		 char s1[] = s.toCharArray();
	      char s2[] = t.toCharArray();
	      
	      int l1 = s1.length;
	      int l2 = s2.length;
	      if(l1==0 && l2 == 0)
	        return false;
	      /*if( (l1 == 1 && l2 == 0 ) || (l1 ==0 && l2 == 1))
	        return true;*/
	      
	      int diff = Math.abs(l1-l2);
	      if(diff > 1)
	        return false;
	        
	       int dp[][] = new int[l1+1][l2+1]; 
	       
	         
	      for(int j=0; j < dp[0].length; j++)
	        dp[0][j] = j;
	      for(int i=0; i < dp.length; i++)
	        dp[i][0] = i;
	       
	       
	       for(int i=1; i < dp.length; i++){
	           for(int j=1; j < dp[0].length; j++){
	               if(s2[j-1] == s1[i-1]){   // One less since the string value would be one less
	                   dp[i][j]= dp[i-1][j-1];
	               }else{
	                   dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1])) + 1;
	               }
	           }
	       }
	       
	       if(dp[l1][l2] == 1)
	            return true;
	            
	        return false;
	    
	}

}
