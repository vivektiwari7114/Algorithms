package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKusongBucketSort {
	public static void main(String args[]){
		int nums[] = {2,1,2,2,1,1,1,3,3};
		int k = 2;
		int l = nums.length;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		for(int i =0 ; i< l ;i++){
			if(mp.containsKey(nums[i]))
				mp.put(nums[i], mp.get(nums[i]) + 1);
			else
				mp.put(nums[i], 1);
		}
		
		//Find the max
		int max = 0;
		for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
			if(max < entry.getValue())
				max = entry.getValue();
		}
		
		
		System.out.println(mp);
		ArrayList<Integer> bucket[] = new ArrayList[max + 1];
		for(int i=0; i < bucket.length; i++)
			bucket[i] = new ArrayList<Integer>();
		
		
		for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
			int index = entry.getValue();
			int value = entry.getKey();
			bucket[index].add(value);
			
		}
		
		ArrayList<Integer> finalL = new ArrayList<Integer>();
		for(int i= bucket.length - 1; i >=0; i--){
			ArrayList<Integer>  tp = bucket[i];
			for(int a : tp)
				finalL.add(a);
			
		}
		System.out.println(finalL.subList(0,k));
		
		
		
	}

}
