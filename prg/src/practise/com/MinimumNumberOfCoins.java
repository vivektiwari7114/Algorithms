package practise.com;

/* Name: Minimum Number of Coins
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function:MinimumNumber of Coins
 */
public class MinimumNumberOfCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {1,2,5};
		int amount = 11;
		
		int data[] = new int[amount+1];
		data[0] = 0;
		for(int i=1; i< amount+1; i++)
				data[i] = Integer.MAX_VALUE;
		
		for(int i=0; i < coins.length; i++){
			for(int j=1; j< data.length;j++){
				if( j >= coins[i]  && data[j -coins[i]] != Integer.MAX_VALUE )
					data[j] =  Math.min(data[j], 1+ data[j - coins[i]]);
				
			}
		}
		
		System.out.println(data[amount]);

	}

}
