package practise.com;

import java.util.*;

public class StackSorting {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(5); s1.push(3); s1.push(9); s1.push(6);

		Stack<Integer> s2 = new Stack<Integer>();

		if( s1.empty() ){
			System.out.println("Stack is Empty");
			return;
		}

		s2.push( s1.pop() );
		while( !s1.empty() ){
		  int t = s1.pop();
		  if(t >= s2.peek() )
			s2.push( t );
		  else{
			while(!s2.empty() &&  s2.peek() > t  )
				s1.push( s2.pop() );
			s2.push(t);

			}
		}
		
		while(!s2.empty()){
			System.out.println(s2.pop());
		}

	}

}
