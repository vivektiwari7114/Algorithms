package practise.com;

/* Name: Find Max of Two Number
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Find Max of two number without using if-else and comparison operator
 */
public class FindMax {
	public static void main(String args[]){
		int a = 15;
		int b = 10;
		int c = a-b;
		System.out.println();
		
		int k = (c >> 31) & 0x1;
		System.out.println(k);
		int max = a-k*c;
		System.out.println("Max "+max);
	}
	

}
