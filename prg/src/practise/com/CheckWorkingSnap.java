package practise.com;

public class CheckWorkingSnap {
	public static void main(String args[]){
		int n = 0b1110;
		while(n > 0){
			int t = n & 1;
			System.out.print(t + "   ");
			n = n >> 1;
		}
	}

}
