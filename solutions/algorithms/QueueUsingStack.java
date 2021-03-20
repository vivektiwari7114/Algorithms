package practise.com;

import java.util.Stack;

/* Name: Queue Using Stack Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement the functionality of the Queue using Stack
 */
public class QueueUsingStack {
	private Stack<Integer> st;
	public QueueUsingStack(){
		st = new Stack<Integer>();
	}
	
	public void add(int val){
		st.push(val);
		
	}
	public int remove(){
		if(st.size() == 0){
			System.out.println("Stack is empty");
			return -1;
		}else{
			Stack<Integer> temp = new Stack<Integer>();
			while(!st.isEmpty())
					temp.push(st.pop());
			int data =temp.pop();
			while(!temp.isEmpty())
					st.push(temp.pop());
			return data;
		}
		
		
	}
	public int peek(){
		if(st.size() == 0){
			System.out.println("Stack is empty");
			return -1;
		}else{
			Stack<Integer> temp = new Stack<Integer>();
			while(!st.isEmpty())
					temp.push(st.pop());
			int data =temp.peek();
			while(!temp.isEmpty())
					st.push(temp.pop());
			return data;
		}
	}
	
	public static void main(String args[]){
		
		QueueUsingStack que = new QueueUsingStack();
		que.add(50);
		que.add(10);
		que.add(15);
		que.add(30);
		System.out.println(que.peek());
		System.out.println(que.peek());
	}

}
