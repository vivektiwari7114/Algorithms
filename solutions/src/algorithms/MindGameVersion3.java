package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MindGameVersion3 {
	public static void main(String args[]){
		String sol = "RRGB";
		String guess = "YGGB";
		List<Character> l1 = new ArrayList<Character>();
		int t = (int)Math.floor(4.5);
		System.out.println(t);
		
		
		int hit =0;
		int psHit = 0;
		for(int i=0; i< sol.length(); i++)
			l1.add(sol.charAt(i));
		
		for(int i=0; i < 4 ; i++){
			if(guess.charAt(i) == sol.charAt(i))
				hit++;
			else{
				
				if(l1.contains( (guess.charAt(i))) ){
						psHit++;
				}
			}
		}
		System.out.println("Hits "+hit + " Psudeo Hits: "+psHit);
	}

}
