package practise.com;

import java.util.*;
public class RoyalNames {
	public static void main(String args[]){
		ArrayList<String> given = new ArrayList<String>();
		given.add("Richard X");
		given.add("Henry II ");
		given.add("Richard VI");
		given.add("Edward VIII");
		given.add("Richard V");
		
		int l = given.size();
		String a[] = new String[l];
		
		for(int i=0; i < l; i++){
			a[i] = given.get(i);
		}
		//Sort the name Alphabatically
		//Collections.sort(given);
		sortTitles(a);
		//Sort the Titles if name are same
		System.out.println(a);
		for(String s : a)
				System.out.print(s+ " ");
		
		
	}
	
	public static void sortTitles(String[]  given){
		
		int l = given.length;
		for(int i=0; i < l ;i++){
			for(int j = i+1; j < l; j++){
				//aman vivek
				if(  given[i].compareTo(given[j]) > 0 ){
					String temp = given[i];
					given[i] = given[j];
					given[j] = temp;
				}
				if(  given[i].compareTo(given[j]) == 0 ){
					String s1 = given[i].split(" ")[1];
					String s2 = given[j].split(" ")[1];
					int n1 = getIntegerValue(s1);
					int n2 = getIntegerValue(s2);
					if(n1 > n2){
						String temp = given[i];
						given[i] = given[j];
						given[j] = temp;
						
					}
					
					
				
				}
			}
		}
		
		
		
	}
	public static int getIntegerValue(String s){
		 int l = s.length();
		    if(l ==0 || s== null)
		        return 0;
		    Map<String, Integer> mp = new HashMap<String, Integer>();
		        mp.put("I",1);
		        mp.put("V",5);
		        mp.put("X",10);
		        mp.put("L",50);
		        mp.put("C",100);
		        mp.put("D",500);
		        mp.put("M",1000);
				int sum = 0;
				int i =0;
				for(i = 0; i < s.length()-1; i++){
					int curr = mp.get(String.valueOf(s.charAt(i)));
					int next = mp.get(String.valueOf(s.charAt(i+1)));
					if(curr < next)
						sum -= curr;
					else
						sum += curr;
					
				}
				sum += mp.get(String.valueOf(s.charAt(i)));
				return sum;
		        
	}
}
