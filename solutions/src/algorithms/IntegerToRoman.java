package practise.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Name: IntegerToRoman Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Given an Integer convert it to into Roman Number.
 */
public class IntegerToRoman {
	public static void main(String args[]){
		int num = 7;
		int n = 0;
		int i =0;
		String finalString = "";
		Map<Integer, String> mp = new HashMap<Integer, String>();
	mp.put(1, "I");mp.put(4, "IV");mp.put(5, "V");mp.put(9, "IX");mp.put(10, "X");mp.put(40, "XL");mp.put(50, "L");mp.put(90, "XC");
	mp.put(100, "C");
	String s = "";
	int max = 0;
	while(num > 0){
		max = 0;
		if(mp.containsKey(num)){
			finalString   += mp.get(num);
			break;
		}else{
			Iterator it = mp.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry pair = (Map.Entry)it.next();
				
				if((int)pair.getKey() < num){
					n = (int)pair.getKey();
					if(max < n){
						max = n;
						 s = pair.getValue().toString();
						// System.out.println("Max "+max);
						 //System.out.println("S "+s);
						 
					}
					
					
		

				}
			}
			finalString += s;
			 //System.out.println("finalString "+finalString);
			num = num - max;
			 //System.out.println("num "+num);
		}
	}
	System.out.println(finalString);
		
	}

}
