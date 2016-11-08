package practise.com;

public class MultiplyTwoString {

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "45";
		multiply(num1, num2);
	}
	public static  void multiply(String num1, String num2){
		
		StringBuilder first = new StringBuilder(num1).reverse();
		StringBuilder second = new StringBuilder(num2).reverse();
		
		int d[] = new int[first.length() + second.length()];
		
		for(int i=0; i< first.length(); i++){
			for(int j=0; j< second.length(); j++){
				int a = Character.getNumericValue(first.charAt(i));
				int b = Character.getNumericValue(second.charAt(j));
				d[i+j] = d[i+j] + a * b;
			}
		}
		
	
		
		
	}

}
