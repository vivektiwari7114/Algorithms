package practise.com;

import java.util.PriorityQueue;

public class ArrayReduction {
	public static void main(String args[]){
		int nums[] = {1,2,3,4};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i < nums.length; i++)
				pq.offer(nums[i]);
		int count =0;
		while(pq.size() != 1){
			int a = pq.poll();
			int b = pq.poll();
			int sum = a + b;
			count = count + sum;
			pq.offer(sum);
			
		}
		
		System.out.println(count);
		
	}

}
