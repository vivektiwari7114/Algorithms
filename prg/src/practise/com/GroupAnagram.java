package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String args[]){
		
		List<List<String>> result = new ArrayList<List<String>>();
		String strs[] = {"cat", "dog", "tac", "god"};
		Map<String, ArrayList<String>> map = new HashMap< String, ArrayList<String>>();
		
		for(String str : strs){
			char arr[] = new char[26];
			for(int i=0; i < str.length();i++){
				
				int t= str.charAt(i) - 'a';
				System.out.println(" "+t);
				arr[t]++;
			}
			String ns  = new String(arr);
			System.out.println("Hello: "+ns);
			if(map.containsKey(ns))	
				map.get(ns).add(str);
			else{
				ArrayList<String> al = new ArrayList<String>();
				al.add(str);
				map.put(ns, al);
			}
		}
		result.addAll(map.values());
		System.out.println(result);
	}
}
