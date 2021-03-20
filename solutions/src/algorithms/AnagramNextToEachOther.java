package practise.com;

import java.util.*;
// Adding comment on test2 branch
public class AnagramNextToEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []  str = {"eat","bag", "tea", "gab", "ate"};
		Map<String, List<String>> mp = new HashMap<String, List<String>>();
		for(String s : str){
			char[] temp = s.toCharArray();
			String key = new String(temp);
			if( !mp.containsKey(temp)){
				List<String > lt = new ArrayList<String>();
				lt.add(s);
				mp.put(key, lt);
			}else{
				List<String> getList = mp.get(key);
				getList.add(s);
			}
		}
		List<String >  res = new ArrayList<String>();
		for(List<String> k : mp.values()){
			for(int i=0; i < k.size(); i++)
					res.add(k.get(i));
		}
		System.out.println(res);
		
	}

}
