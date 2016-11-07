package practise.com;
/* Brute Force Coin Change
 * Parameters: NA
 * Return :NA
 * Function:Total Number of ways to count the number of ways for making change
 */
public class CoinCHange {
	public static void main(String args[]){
		int total = 5;
		int ways = 0;
    	for (int count3 = 0; count3 * 3 <= total; ++count3) {
    		for (int count2 = 0; count2*2 <= total; ++count2) {
    			for (int count1 = 0; count1*1 <=total; ++count1) {
    				
    				int sum =  count3*3+ count2*2 + count1*1;
    				// when the first three types of coins are selected, the way of selecting coins
    				// with denomination 1 cent has already known.
    				//System.out.println("Sum: "+sum);
    				if (sum <= total) {
    					++ways;
    				}
    			}
    		}
    	}
    	System.out.println(ways);
	}

}
