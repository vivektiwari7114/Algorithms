package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Name: The Mind game
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Guess number of hits and Psuedo hits in the the given array combination
 */

public class TheMindGame {
	public static void main(String args[]){
		
		String first = "GGGB";
		String second = "RRGB";
		int hit = 0;
		int psHit = 0;
		ArrayList<Character> l1 = new ArrayList<Character>();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char one[] = first.toCharArray();
		char two[] = second.toCharArray();
		
		for(int i=0; i < 4; i++){
			if(one[i] == two[i])
				hit++;
			else{
				l1.add(one[i]);
				if( mp.containsKey(two[i]) )
					mp.put(two[i], mp.get(two[i]) + 1);
				else
					mp.put(two[i], 1);
				}
		}
		for(int i= 0; i < l1.size(); i++){
			if(mp.containsKey(l1.get(i))){
				psHit++;
				int curr = mp.get(l1.get(i));
				if(curr == 1){
					mp.put(l1.get(i), 0);
				}else{
					mp.put(l1.get(i), curr - 1);
				}
			}
				
		}
		
		System.out.println("PsudeoHit "+ hit);
		System.out.println("PsudeoHit "+ psHit);
		
		
	}
}
