package practise.com;

import java.util.*;

public class checkWorking {
	// Replace Space with %20 
	public static void main(String args[]){
		
		int given[] = {1,2,3,4,5};
		int k=4;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				return a-b;
			}
			
		});
		for(int i=0; i < given.length; i++){
			pq.offer(given[i]);
			if(pq.size() > k)
					pq.poll();
			
		}
		System.out.println("Size "+pq.size());
		
		int size = pq.size();
		
		for(int i=0; i < size; i++){
			
			System.out.print(pq.poll() + " ");
			
		}
		
		
		
		
		
		
		
	

	}
}


