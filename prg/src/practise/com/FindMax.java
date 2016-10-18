package practise.com;

public class FindMax {
	public static void main(String args[]){
		int a = 5;
		int b = 10;
		int c = a-b;
		System.out.println();
		
		int k = (c >> 31) & 0x1;
		System.out.println(k);
		int max = a-k*c;
		System.out.println("Max "+max);
	}
	

}
