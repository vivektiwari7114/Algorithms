package practise.com;

import java.util.Stack;

public class TernaryExpression {
	public static void main(String args[]){
		String expr = "a?b?c?d:e:f:g";
		Stack<TreeN> st = new Stack<TreeN>();
		 TreeN root = new TreeN(expr.charAt(0));
		 st.push(root);
		 
		 for(int i =1; i < expr.length(); i=i+2){
			 TreeN next = new TreeN (expr.charAt(i+1));
			 TreeN curr = st.peek();
			 if(expr.charAt(i) == '?')
				 curr.left = next;
			 if(expr.charAt(i) == ':'){
				 st.pop();
				 while(st.peek().right != null)
					 	st.pop();
			 
			 st.pop().right = next;
			 }
			 st.push(next);
			 
		 }
		 display(root);
		 
		 
	}
	public static void display(TreeN root){
		if(root != null){
			display(root.left);
			System.out.print(root.data +" ");
			display(root.right);
		}
		
		
	}

}

class TreeN{
	char data;
	TreeN left ;
	TreeN right ;
	public TreeN(char data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


