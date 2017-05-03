package practise.com;

	public class checkWorking{
		public static void main(String args[]){
			int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			System.out.println( PredictTheWinner(nums) );
			
		}
		

		public static boolean PredictTheWinner(int[] nums) {
			int n = nums.length, sum = 0;
			if(n % 2 == 0) return true;
		        int[][] dp = new int[n][n];
		        for(int i=0; i < n; i++) {
		            dp[i][i] = nums[i];
		            sum += nums[i];
		        }

		        for(int j = 0; j < n; j++){
		            for(int i = j - 1; i >= 0; i--){
		            	int a = (i + 1 < n && j - 1 >= 0) ? dp[i + 1][j - 1] : 0;
				int b = (i + 2 < n) ? dp[i + 2][ j] : 0;
				int c = (j - 2 >= 0) ? dp[i][j - 2] : 0;
		                dp[i][j] = Math.max(Math.min(a, b) + nums[i], Math.min(a, c) + nums[j]);
		            }
		        }
		    
		    for(int i =0; i < n; i++){
		    	System.out.println();
		    	for(int j=0; j < n ; j++){
		    		System.out.print(dp[i][j] + " ");
		    	}
		    }
		
		    return dp[0][n - 1] * 2 >= sum;
		}

	
}