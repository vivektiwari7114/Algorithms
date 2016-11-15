package practise.com;

import java.util.*;

public class PriorityQueueImplementation {

	public static void main(String[] args) {
		
		int a[] = {5,3,4,21,1,6,12,17};
		int k = 3;
		
		
		
			 
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				return b-a;
			}	
		});
		
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
			pq.offer(a[i]);
			if(pq.size() > k)
				pq.poll();
		}
		System.out.println("Print");
		for(int i=0; i < pq.size(); i++)
				System.out.println(pq.poll());
		

	}

}
