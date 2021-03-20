package practise.com;

import java.util.Random;

public class RandomNumber {
	public static void main(String args[]){
		
		int x =0;
			do {
			x = (random5() + 1)  + (5 * random5() );
			
			//System.out.println(x);
			}while (x > 21);
			
			
			System.out.println(x % 7 +1 );
			
			
		
		
	}
	public static  int random5(){
		Random rm = new Random();
		return rm.nextInt(5); 
	}
}
