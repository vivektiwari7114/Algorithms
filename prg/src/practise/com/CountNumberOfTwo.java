package practise.com;

public class CountNumberOfTwo {
	public static void main(String args[]){
		int n = 3;
		
		System.out.println( CountNumber(n) );
		
	}
	public static int CountNumber(int n){
		// get the largest
		if(n == 0)
			return 0;
		int power = 1;
		
		while(10 *power < n){
			power *= 10;
		}
		//System.out.println("Power "+power);
		
		int first = n / power;
		int rem = n % power;
		int firstCount =0;
		
		if(first > 2){
			firstCount = power;
		}else if(  first == 2){
			firstCount = rem + 1;
		}
		
		int secondCount = first * CountNumber(power -1 ) + CountNumber(rem);
		return firstCount + secondCount;
		
	}

}
