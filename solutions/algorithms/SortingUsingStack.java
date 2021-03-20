package practise.com;

import java.util.Stack;

/* Name: Sorting  Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Sort a stack in Ascending order 
 */
public class SortingUsingStack {
	public static void main(String args[]){
		
		Stack<Integer> s1= new Stack<Integer>();
		s1.push(25);s1.push(20);s1.push(15);s1.push(5);
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(!s1.isEmpty()){
			int data = s1.pop();
			while( !s2.isEmpty() && s2.peek() > data)
					s1.push(s2.pop());
			s2.push(data);
		}
		//Display Function 
		
		while( !s2.isEmpty() ){
			System.out.print(s2.pop()+" ");
		}
		
	}

}
