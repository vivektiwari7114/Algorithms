package practise.com;

public class SwapNumber {
	public static void main(String args[]){
		int a = 20;
		int b = 100;
		System.out.println("a "+ a + " b "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a "+ a + " b "+b);
	}

}
