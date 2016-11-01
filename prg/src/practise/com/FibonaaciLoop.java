package practise.com;

/* Name: Fibonacci implemetation iteration
 * Parameters: NA
 * Return :Void
 * Function:  Fibonacci implemetation iteration
 */

public class FibonaaciLoop {
	
	public static void main(String args[]){
		int n =5;
		System.out.println("Result is: "+fibbonacciNumber(n));
	}
	public static int fibbonacciNumber(int n){
		int a = 1;
		int b = 1;
		int c =0;
		if(n==1)
				return a;
		else if(n==2)
				return b;
		else if (n > 0) {
			for(int i = 3; i<=n ;i++){
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
			
		else
			return -1;
	}

}
