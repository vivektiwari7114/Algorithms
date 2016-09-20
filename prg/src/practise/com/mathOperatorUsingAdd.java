package practise.com;

public class mathOperatorUsingAdd {
	public static void main(String args[]){
		int a = -4;
		int b = 0;
		//System.out.println(subtract(a, b));
		System.out.println(multiply(a, b));
		
	}
	public static int multiply(int a , int b){
		a =  b < 0 ? negate(a) : a;
		int d = b < 0 ? negate(b): b;
		int sum = 0;
		while(d != 0){
			sum = sum + a;
			d--;
		}
		return sum;
	}
	public static int subtract(int a , int b){
		return a + negate(b);
	}
	public static int negate(int a){
		int d = a < 0? 1:-1;
		int sum = 0;
		while(a != 0){
			sum = sum + d;
			a = a + d;
		}
		return sum;
	}

}
