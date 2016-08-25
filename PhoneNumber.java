package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Name: PhoneNumber Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Generate Phone Number sequence
 */
public class PhoneNumber {
	public static void main(String args[]){
		
		String digits = "234";
		Map<Character, char[]> mp = new HashMap<Character, char[]>();
		mp.put('2', new char[] {'a','b','c'});
		mp.put('3', new char[] {'d','e','f'});
		mp.put('4', new char[] {'g','h','i'});
		mp.put('5', new char[] {'j','k','l'});
		mp.put('6', new char[] {'m','n','o'});
		mp.put('7', new char[] {'p','q','r','s'});
		mp.put('8', new char[] {'t','u','v'});
		mp.put('9', new char[] {'w','x','y','z'});
		List<String> store = new ArrayList<String>();
		if(digits.length() == 0)
				System.exit(0);
		
		generateStringSequence(store, mp, 0,digits,new StringBuilder());
		System.out.println(store);
	}
public static  void generateStringSequence(List<String> store, Map<Character,char[]> mp, int index, String digits,StringBuilder sb ){
	if(index >= digits.length()){
		store.add(sb.toString());
		return;
	}
	char ch = digits.charAt(index); 
	char arr[] = mp.get(ch);
	for(int i =0 ; i < arr.length; i++){
		sb.append(arr[i]);
		generateStringSequence(store, mp, index+1, digits, sb);
		sb.deleteCharAt(index);
		
	}
	
}
}