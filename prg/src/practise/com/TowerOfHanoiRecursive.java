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
public class TowerOfHanoiRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void towerOfHanoi(int n , String s, String d, String a){
		if( n == 1){
			
		}
		towerOfHanoi(n-1, s, a, d);
		System.out.println("Move Disk "+ n + " from " + s + " to "+ d);
		towerOfHanoi(n-1, s, a, d);
		
		
	}

}
