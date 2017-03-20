package practise.com;
import java.util.*;

public class checkRotation {
	/* Name: Check Rotaion
	 * Parameters: Not Applicable
	 * Return :Void
	 * Function: Given two strings check whether one is rotation of another or not 
	 */
	public static void main(String args[]){
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
			
			public int compare(Integer a, Integer b){
				return b-a;
			}
		});
		
		pq.offer(1);
		pq.offer(10);
		System.out.println(pq.poll());
		
	}
}
