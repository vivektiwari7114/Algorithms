package practise.com;


/* Name: NumberOfBitsToConvertOneNumberToAnother
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Number of bits required to convert one number to another
 */
public class NumberOfBitsToConvertOneNumberToAnother {
		public static void main(String args[]){
			int n1 = 31;
			int n2 = 14;
			
			int c = n1 ^ n2;
			int count = 0;
			while(c !=0){
				count = count + (c & 1);
				c = Integer.parseInt(Integer.toBinaryString(c >> 1), 2);
			}
			System.out.println(count);
			
		}

}
