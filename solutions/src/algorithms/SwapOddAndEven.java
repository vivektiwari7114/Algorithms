package practise.com;

/* Name: Swap Odd and Even
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Swap - Odd and even number
 */
public class SwapOddAndEven {
	public static void main(String args[]){
		int n = 42;
		int left = n & 0xaa;
		left = Integer.parseInt(Integer.toBinaryString(left  >> 1),2);
		int right = n & 0x55;
		right = Integer.parseInt(Integer.toBinaryString(right  << 1),2);
		
		System.out.println("Result is: "+ (right | left));
		 
	}

}
