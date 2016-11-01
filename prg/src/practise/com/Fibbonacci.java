package practise.com;

public class Fibbonacci {
	
	public static void main(String args[]){
		int n =6;
		System.out.println("Result is: "+fibbonacciNumber(n));
	}
	public static int fibbonacciNumber(int n){
		if(n==1)
				return 1;
		if(n==2)
				return 1;
		if (n > 0) 
			return (fibbonacciNumber(n-1) + fibbonacciNumber(n-2) );
		else
			return -1;
	}
}
