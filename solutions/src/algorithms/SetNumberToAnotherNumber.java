package practise.com;


/* Name: Decimal-To-Binary Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Convert a Fractional Decimal Number To Binary
 */
public class SetNumberToAnotherNumber {
		public static void main(String args[]){
			
				double n = 434.26;
				int integerPart = (int)n;
				double fractionalPart = n - integerPart;
				StringBuilder frontString = new StringBuilder();
				
				while(integerPart != 0){
					int rem = integerPart %2;
					frontString.append(rem);
					integerPart = integerPart / 2;
				}
				frontString = frontString.reverse();
				
				StringBuilder backString = new StringBuilder();
				while(fractionalPart > 0){
					double  temp = fractionalPart * 2;
					int val = (int) temp;
					backString.append(val);
					fractionalPart = temp -val;
					
					
				}
				System.out.println("Result is "+frontString +"."+backString);
			
		}

}
