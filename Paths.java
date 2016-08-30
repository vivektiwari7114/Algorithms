package practise.com;

/* Name: Unique Paths
 * Parameters: NA
 * Return :Number of paths 
 * Function: Calculate Number of Paths 
 */
public class Paths {
	public static void main(){
		int n = 3;
		int square[][] = new int[n][n];
		
		for(int i = 0; i< n; i++){
			square[i][0] = 1;
			square[0][i] = 1;
		}
		for (int i =1; i< n;i++){
			for(int j = 1; j<n; j++){
				square[i][j] = square[i-1][j] + square[i][j-1];
			}
		}
		System.out.println(square[n-1][n-1]);
	}

}
