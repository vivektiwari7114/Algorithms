package practise.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String args[]){
		int nums[] = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
		
		List<Integer> sList = new ArrayList<Integer>();
		for(int i =0 ; i< nums.length; i++)
				sList.add(nums[i]);
		
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		for(int i =0;i <sList.size(); i++){
		    for(int j=0; j< sList.size() && j != i; j++ ){
		    	
			List<Integer> tempList = new ArrayList<Integer>(sList);
			int sum = sList.get(i) + sList.get(j);
			int resultant = 0 - (sum);
			tempList.remove(i);
			tempList.remove(j);
			if(tempList.contains(resultant)){
			    	List<Integer> tList = new ArrayList<Integer>();
					tList.add(sList.get(i));
					tList.add(sList.get(j));
					tList.add(resultant);
					if(check(finalList, tList))
						finalList.add(tList);
			}
		   }	
		}
		System.out.println(finalList);
		
  }
public static boolean check(List<List<Integer>> finalList,  List<Integer> tList){
	Set<Object> st1 = new HashSet<Object>();
    st1.addAll(tList);
	
	for(int i =0 ; i < finalList.size(); i++ ){
	           Set<Object> st2 = new HashSet<Object>();
	            st2.addAll(finalList.get(i));
	            if(st1.equals(st2))
	            	return false;
	          }
			return true;
	}
	

}
