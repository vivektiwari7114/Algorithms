package practise.com;

import java.util.Stack;

public class StringMatching {
	public static void main(String args[]){
		String input = "AaBbCc";
		
	StringBuilder sb = new StringBuilder(input);
	Stack<Character> st = new Stack<Character>();
	int count = 0;
	
	if(sb.length() == 0 )
		return ;
	
	//st.push(sb.charAt(0));
	
	for(int i=0; i < sb.length(); i++){
		if (sb.charAt(i) == ' '){
			continue;
		}
	else if (st.isEmpty() && i != sb.length()){
			st.push(sb.charAt(i));
			continue;
		}
	else if ( Character.toLowerCase( sb.charAt(i) ) == Character.toLowerCase(st.peek()) ){
			st.pop();
			count ++;
		}else if( Character.isUpperCase( sb.charAt(i))  && Character.isUpperCase( st.peek() )  ){
			st.push(sb.charAt(i));
			count++;
		}else if ( Character.isLowerCase( sb.charAt(i))  && Character.isLowerCase( st.peek() )  ){
			
			break;
		}
		
	}
	
	System.out.println(count);
	
	}

}
