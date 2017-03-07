/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

/**
 * @author VivekTiwari
 *
 */
public class SplitFunction {
	public static void main(String args[]){
		String given = "Vive/Tiwari/Tripti";
		String res[] = given.split("/");
		
		for(String t : res)
			System.out.println(t);
		
		System.out.println("******");
	}

}
