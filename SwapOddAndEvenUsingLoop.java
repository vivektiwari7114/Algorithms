package practise.com;

/* Name: Swap Odd and Even
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Swap - Odd and even number using loop
 */
public class SwapOddAndEvenUsingLoop {
	public static void main(String args[]){
		int n = 42;
		char str[] = Integer.toBinaryString(n).toCharArray();
		for (int i = str.length - 1; i >0; i--){
			char temp = str[i];
			str[i] = str[i-1];
			str[i-1] = temp;
		}
		String res = new String(str);
		System.out.println("Result is:"+Integer.parseInt(res, 2));
		
	}

}
