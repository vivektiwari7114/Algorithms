package practise.com;

public class PredictTheWinner{
	public static void main(String args[]){
		int nums[] = {1, 5, 2, 4, 7};
		System.out.println( PredictTheWinner(nums) );
		
	}
	

	public static boolean PredictTheWinner(int[] nums) {
		 
        if(nums == null || nums.length == 0)
            return false;
        int n = nums.length;
        int sum = 0;
        int dp[][] = new int[n][n];
        
        for(int i =0; i < n; i++){
            sum += nums[i];
            dp[i][i] = nums[i];
        }
        
        for (int j = 0 ; j < n ; j++){
            for(int i = j-1; i >= 0 ; i--){
                int a = i+1 < n && j-1 >=0 ? dp[i+1][j-1]:0 ;
                int b = i+2 < n ? dp[i+2][j]:0 ;
                int c = j-2 >= 0?dp[i][j-2]:0 ;
                
                dp[i][j] = Math.max(  (Math.min(a,b) + nums[i]), ( Math.min(a,c) + nums[j] )  );
            }
        }
         for(int i =0; i < n; i++){
	    	System.out.println();
	    	for(int j=0; j < n ; j++){
	    		System.out.print(dp[i][j] + " ");
	    	}
	    }
        return dp[0][n-1]* 2 >= sum;
	}

}

