package practise.com;

/* Name: Multiply two String
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function:Multiply two strings
 */
public class MultiplyTwoString {

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "45";
		System.out.println( multiply(num1, num2) );
	}
	public static  String multiply(String num1, String num2){
		StringBuilder s1 = new StringBuilder(num1).reverse();
		StringBuilder s2 = new StringBuilder(num2).reverse();
		
		int d[] = new int [s1.length() + s2.length()];
		for(int i=0; i < s1.length(); i++){
			for(int j=0; j< s2.length(); j++){
				d[i+j] = d[i+j] + (s1.charAt(i) - '0') *  (s2.charAt(j) - '0');
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < d.length; i++){
			int sum = d[i]% 10;
			int carry = d[i]/10;
			if(i+1 < d.length)
					d[i+1] = d[i+1] + carry;
			sb.append(sum);
		}
		
		int j = sb.length()-1;
		while(j > 0 && sb.charAt(j) == '0'){
				sb.deleteCharAt(j);
				j--;
		}
		
		return sb.reverse().toString();
		
		
	}

}
