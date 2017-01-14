package practise.com;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoom2 {
	public static void main(String args[]){
		
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dept[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		// Sort the aarival time in increasing order
		
		Arrays.sort(arr);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(dept[0]);
		
		int count = 1;
		
		for(int i=1; i < arr.length; i++){
			System.out.println(pq.peek());
			if( arr[i] < pq.peek()){
				count++;
			}else{
				pq.poll();
			}
			
			pq.offer(dept[i]);
			
		}
		
		System.out.println(count);
		
	}
}
