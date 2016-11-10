package practise.com;

/* Coin Chnage Dynamic problem
 * Parameters: NA
 * Return :NA
 * Function:Coin Chnage Dynamic Problem solution
 */
public class CoinnChange {

	public static void main(String[] args) {
		int amount = 4;
		int coins [] = {1,2,3};
		int data[][] = new int [coins.length + 1][amount +1];
		
		for(int i=0; i <= coins.length; i++)
				data[i][0] = 1;
		for(int i=1; i <= amount; i++)
				data[0][i] = 0;
		
		for(int i=1; i <= coins.length; i++){
			for(int j = 1; j <= amount; j++){
				if( coins[i-1] > j )
						data[i][j] = data[i-1][j];
				else
						data[i][j] = data[i-1][j] + data[i][j-coins[i-1]];
			}
		}
		System.out.println(data[coins.length][amount]);
		
	int i = coins.length;
	int j = amount-1;
	int sum = 0;
	while(j >=0){
		sum = sum + data[i][j];
		j--;
	}
	System.out.println(sum);
	}

}
