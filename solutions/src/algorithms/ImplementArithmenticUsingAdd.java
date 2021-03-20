package practise.com;


/* Name:Implement arithmetic operator using only add
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement arithmetic operator using only add
 */
public class ImplementArithmenticUsingAdd {
	public static void main(String args[]){
		int a = 2;
		int b = 3;
		System.out.println(divide(500,10));
		
		
	}
	public static int negate(int a){
		int d = (a <0)?1:-1;
		int x = Math.abs(a);
		int sum = 0;
		while(x != 0){
			sum = sum + d;
			x--;
		}
		return sum;
	}
	public static int subtract(int a , int b){
		return  a + negate(b);
	}
	public static int multiply(int a , int b){
		// To decrease the number of iterations
		if(a < b ) return multiply(b, a);
		int sum = 0;
		int x = Math.abs(b);
		while(x > 0){
			sum = sum + a;
			x--;
		}
		if(b < 0)
			return negate(sum);
		return sum;
			
	}
	public static int divide (int a , int b){
		if(a ==0)
				return 0;
		if(b ==0)
				return -1;
		if(a < b)
				return 0;
		
		int x = Math.abs(a);
		int y = Math.abs(b);
		int count = 0;
		while(x >= y){
			x = x-y;
			count++;
		}
		if(a < 0 && b > 0 || a > 0 && b < 0)
				return negate(count);
		return count;
	}

}
