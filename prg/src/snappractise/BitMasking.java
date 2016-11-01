package snappractise;

public class BitMasking {
		public static void main(String args[]){
			int n = 0b10000000000;
			int m = 0b10101;
			int i = 2;
			int j = 6;
			
			while(i <= j){
				int bit = m & 0b1;
				int temp = bit << i;
				n = n | temp;
				i++;
				m = m >> 1;
				
			}
			System.out.println(Integer.toBinaryString(n));
		}

}
