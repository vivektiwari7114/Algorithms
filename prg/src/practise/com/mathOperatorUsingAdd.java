package practise.com;

public class mathOperatorUsingAdd {
	public static void main(String args[]){
		int a = 0;
		int b = -2;
		//System.out.println(subtract(a, b));
		System.out.println(divide(a, b));
		
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
	public static int  divide(int a , int b){
		if(b ==0)
			return -1;
		int divd = a < 0?negate(a): a;
		int div = b < 0? negate(b): b;
		
		if(divd < div)
				return 0;
		int count = 0;
		
		while( divd >= div ){
			divd = divd - div;
			count++;
		}
		if(a<0 && b < 0)
				return count;
		if(a < 0 || b < 0)
				return negate(count);
		return count;
		
	}

}
