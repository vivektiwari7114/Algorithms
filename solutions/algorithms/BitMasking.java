package practise.com;

public class BitMasking {
		public static void main(String args[]){
			int n = 0b10001111100;
			int m = 0b10101;
			int i = 2;
			int j = 6;
			int num =0;
			int max = ~0;
			int left = max - ((1 << j+1) - 1);
			//System.out.println(Integer.toBinaryString(left));
			
			int right = ((1 << i) - 1);
			//System.out.println(Integer.toBinaryString(right));
			int mask = left | right;
			num = (n & mask)| (m << i);
			
			System.out.println(Integer.toBinaryString(num));
		}

}
