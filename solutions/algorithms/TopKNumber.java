
package practise.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


/* Bounded TopKNumber in an array
 * Parameters: NA
 * Return :NA
 * Function:Given an array with list of number find the top k number
 */

public class TopKNumber {
	public static void main(String args[]){
		int nums[] = {1,1,2,2,3,3};
		int k =2;
		
		Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
		 int l = nums.length;
		 for(int i=0; i< l; i++){
			 if(mp.containsKey(nums[i]))
				 	mp.put(nums[i], mp.get(nums[i]) + 1);
			 else
				 mp.put(nums[i], 1);
			 
		 }
		 
		 PriorityQueue<Pair> que = new PriorityQueue<Pair>( new Comparator<Pair>() {
			 public int compare(Pair a , Pair b){
				 return a.value - b.value;
			 }
			 
			 
		 });
		 System.out.println(mp);
		 
		 for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
			 Pair p = new Pair(entry.getKey(), entry.getValue());
			 que.offer(p);
			 if(que.size() > k)
				 	que.poll();
		 }
		 
		 List<Integer> lt = new ArrayList<Integer>();
		 while(que.size() > 0)
			 	lt.add(que.poll().key);
		
		 System.out.println(lt);
		
	}
}
class Pair {
	int key;
	int value;
	public Pair(int key, int value){
		this.key = key;
		this.value = value;
	}
}


