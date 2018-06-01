package practise.com;

public class AddTwoNumber {
	
	public static void main(String args[]){
		
		int num1 = 18;
		int num2 = 3;
		
		System.out.println( addTwo(num1, num2) );
	}

	/**
	 *
	 * Add two number without using + operator
	 * Parameter: Take two parameter
	 * Returns: sum of two number(a and b in this case)
	 *
	 */
	public static int addTwo(int a , int b ){
		if ( b == 0 )
			return a;
		int sum = a ^ b;
		int carry = (a & b) << 1 ;
		return addTwo(sum , carry);
	}

}
