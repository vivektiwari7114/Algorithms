package practise.com;

import java.util.Random;

public class RandomNumber {
	public static void main(String args[]){
		
		
		int num = 5 * (returnRandomFive() + returnRandomFive() );
			System.out.println(num%7 + 1);
			
		
	}
	public static int returnRandomFive(){
		Random rm = new Random();
		return ( (rm.nextInt(5) % 5 ) + 1 );
	
	}

}
