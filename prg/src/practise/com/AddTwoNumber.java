package practise.com;

public class AddTwoNumber {
	
	public static void main(String args[]){
		
		int num1 = 18;
		int num2 = 3;
		
		System.out.println( addTwo(num1, num2) );
	}
	public static int addTwo(int a , int b ){
		if ( b == 0 )
			return a;
		int sum = a ^ b;
		int carry = (a & b) << 1 ;
		return addTwo(sum , carry);
	}

}
