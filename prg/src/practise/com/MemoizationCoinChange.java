package practise.com;


/* Name: Solving coin problem using Memoization 
 * Parameters: NA
 * Return :Number of paths 
 * Function: Solving coin problem using Memoization 
 */
public class MemoizationCoinChange {
	public static void main(String args[]){
	int s[] = {2,5,3,6};
	int n = 10;
	int m = s.length;
	int a[][] = new int[m+1][n+1];
	
	for(int i =0; i < m+1; i++)
		a[i][0] = 1;
	for(int i =1; i < n+1; i++)
		a[0][i] = 0;
	
	
	for(int i = 1; i < m+1; i++){
		for(int j = 1; j < n+1; j++){
			//System.out.println(i +"- "+ j);
			int x = a[i-1][j];
			int y = j - s[i-1] >= 0 ? a[i][j-s[i-1]]: 0; 
			a[i][j] = x + y;
			
		}
	}
	

	
	System.out.println("Result is:"+a[m][n]);
  }
}
