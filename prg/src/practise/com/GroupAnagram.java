package practise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String args[]){
		
		List<List<String>> result = new ArrayList<List<String>>();
		String strs[] = {"cat", "dog", "tac", "god"};
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(String str : strs){
		char temp[] = str.toCharArray();
		Arrays.sort(temp);
		String ns = new String(temp);
		if(map.containsKey(ns))
			map.get(ns).add(str);
		else{
			ArrayList<String> tp = new ArrayList<String>();
			tp.add(str);
			map.put(ns, tp);
		}
	}
		result.addAll(map.values());
		System.out.println(result);
		
	}
}
