package practise.com;

import java.util.HashMap;
import java.util.Map;


/* Bounded: Number of steps to convert from one anagram to another
 * Parameters: NA
 * Return :NA
 * Function:Number of steps to convert from one anagram to another
 */

public class AnagramVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eee";
		String t = "eee";
		int count = 0;
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i=0; i < s.length(); i++){
			if(mp.containsKey(s.charAt(i)))
				mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
			else
				mp.put(s.charAt(i), 1);
		}
		
		for(int i=0; i < t.length(); i++){
			if(mp.containsKey(t.charAt(i) ) ) {
				if(mp.get(t.charAt(i)) == 1)
					mp.remove(t.charAt(i));
				else
					mp.put(t.charAt(i), mp.get(t.charAt(i)) - 1 );
			}else
				count++;
				
		}
		System.out.println(count);
		
	}

}
