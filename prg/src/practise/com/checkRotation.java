package practise.com;

public class checkRotation {
	/* Name: Check Rotaion
	 * Parameters: Not Applicable
	 * Return :Void
	 * Function: Given two strings check whether one is rotation of another or not 
	 */
	public static void main(String args[]){
		String s1 = "erbottlewat";
		String s2 = "waterbottle";
		String result = s1 + s1;
		if( result.contains(s2) )
				System.out.println("One is the Rotation of other");
		else
			System.out.println("One is not the Rotation of other");
	}
}
