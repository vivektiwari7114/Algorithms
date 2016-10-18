package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheMindGame {
	public static void main(String args[]){
		String sol = "RYGB";
		String guess = "YRBG";
		Map<Character,Integer> m1 = new HashMap<Character,Integer>();
		List<Character> l1 = new ArrayList<Character>();
		
		char a1[] = sol.toCharArray();
		char a2[] = guess.toCharArray();
		
		int hit =0;
		int psHit = 0;
		
		for(int i=0; i< a1.length;  i++){
			if(a1[i] == a2[i])
				hit++;
			else{
				l1.add(a1[i]);
				if(m1.containsKey(a2[i]))
					m1.put(a2[i], m1.get(a2[i]) + 1);
				else
					m1.put(a2[i], 1);
			}
			
		}
		for(int i=0; i < l1.size(); i++){
			if(m1.containsKey( l1.get(i)) ){
				psHit++;
				if( m1.get(l1.get(i)) > 1 )
					m1.put(l1.get(i), m1.get(l1.get(i)) - 1);
				else
					m1.remove(l1.get(i));
			}
		}
		
		System.out.println("Hits "+hit + " Psudeo Hits: "+psHit);
	}
}
