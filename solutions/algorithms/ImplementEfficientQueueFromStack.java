package practise.com;

import java.util.*;
public class ImplementEfficientQueueFromStack {
	Stack<Integer>  s1 = new Stack<Integer>();
	Stack<Integer>  s2 = new Stack<Integer>();
	
	public  void add(int data){
		s1.push(data);
	}
	public int remove(){
		if(!s2.empty())
			return s2.pop();
		while(!s1.empty()){
			s2.push(s1.pop());
			
		}
		return s2.pop();
	}
	public int peek(){
		if(!s2.empty())
			return s2.peek();
		while(!s1.empty()){
			s2.push(s1.pop());
			
		}
		return s2.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementEfficientQueueFromStack st = new ImplementEfficientQueueFromStack();
		st.add(4);
		st.add(40);
		st.add(400);
		

	}

}
