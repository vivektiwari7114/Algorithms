package practise.com;
import java.util.*;

public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(simpleExpressionTree(  "((A(B))CD)/S"   ));
	}
	
	public static  String simpleExpressionTree(String s){
		String res = "";
		if (s== null || s.length() == 0)
				return "";
		String input = s.replaceAll(" ", "");
		String []parseInput = input.split("/");
		String midString = parseInput[0];
		if(midString.equals(""))
				return input;
		
		if( parseInput.length == 1)
			return midString;
		String operations = parseInput[1];
		
		
		for(int i=0; i < operations.length();i++){
			if(operations.charAt(i) == 'R')
				midString =  findReverse(midString );
			else{
				midString =  findSequence(midString);
				
			}
		}
		
		return midString;
	
		
		
	}
	public static String findSequence(String t){
		
		StringBuilder s = new StringBuilder(t);
		Stack<NodeSt>  st= new Stack<NodeSt>();
		if(s.charAt(0) != '(')
				return t;
		
		
		if( s.charAt(0) == '(' &&  s.charAt(s.length() - 1) == ')') {
			s.deleteCharAt(0);
			s.deleteCharAt(s.length() - 1);
		}
			
		
		
		for(int i=0; i < s.length(); i++){
			NodeSt  curr = new NodeSt(s.charAt(i), i);
			if(curr.val == '('){
				st.push(curr);
			}
			else{
					if(curr.val == ')'){
						if(st.peek().val == '('){
							NodeSt prev = st.pop();
							st.push(new NodeSt('#',i) );
							st.push(new NodeSt('#',i) );
							//System.out.println(curr.in);
							//System.out.println(st.peek().in);
							s.setCharAt(prev.in,'#' );
							 s.setCharAt(curr.in, '#');
							// System.out.println(s);
							
							
							
						}
					}
					
				}
		}
			
		
			String k = s.toString().replaceAll("\\#","");
		
		
		return k;
		
	}
	public static String findReverse(String s){
		
		char s1[] = {};
        int j=0, i=0;
       if (s.length() == 0)
    	   return s;
       else 
       {
               s1 = s.toCharArray();     
           for(i =0,j = s1.length-1; i < j ; i++, j--)
           {
               char temp = s1[i];
               s1[i] = s1[j];
               s1[j] = temp;
           }
           
       }
     
       String out = String.valueOf(s1);
     
       out = out.replaceAll("\\(", "#");
       out = out.replaceAll("\\)", "\\$");
       //System.out.println(out);
       out = out.replaceAll("#", "\\)");
       out = out.replaceAll("\\$", "\\(");
       return out;
		
	}

}
class NodeSt{
	char val;
	int in;;
	public NodeSt(char val, int in){
		this.val = val;
		this.in = in;
	}
}
