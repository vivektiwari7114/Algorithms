package practise.com;


/* Name: Calculate the ways to make N cents using denomination
 * Parameters: NA
 * Return :Number of paths 
 * Function: Calculate the ways to make N cents using denomination
 */
public class CoinChangeDP {
	public static void main(String args[]){
		int s[] = {1,2,3};
		int amount = 5;
		int noOfCoins = s.length;
		System.out.println(getNumberOfWays(s, noOfCoins, amount));
		
	}
	public static  int getNumberOfWays(int s[], int noOfCoins , int amount){
		
		if(amount == 0)
			return 1;
		if(amount < 0 || (noOfCoins <= 0 && amount > 0 ))
			return 0;
		return (getNumberOfWays(s,noOfCoins,amount - s[noOfCoins - 1] ) 
				+getNumberOfWays(s,noOfCoins-1,amount  ) );
		
	}

}
