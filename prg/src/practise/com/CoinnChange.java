package practise.com;

public class CoinnChange {

	public static void main(String[] args) {
		int n = 4;
		int coins [] = {1,2,3};
		int a[][] = new int [coins.length][n+1];
		for(int i=0; i < n+1; i++)
				a[0][i] = 1;
		for(int i=0; i < coins.length; i++)
				a[i][0] = 1;
		
		for(int i=1; i < coins.length; i++){
			for(int j = 1; j < n+1; j++){
				if( coins[i] > j )
						a[i][j] = a[i-1][j];
				else
						a[i][j] = a[i-1][j] + a[i][j-coins[i]];
			}
		}
		System.out.println(a[coins.length - 1][n]);
	}

}
