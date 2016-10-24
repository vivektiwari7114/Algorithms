package practise.com;

/* Name: Find Maximum of two numbers without using comparison and If-Else statement	
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: return maximum of two number
 */
public class MaximumNumberWithoutIfElse {
	public static void main(String args[]){
		int a = 15;
		int b = 10;
		int k = (a-b) >> 31;
		//System.out.println(k);
		int c = a +k *(a-b);
		System.out.println(c);
	}
}
