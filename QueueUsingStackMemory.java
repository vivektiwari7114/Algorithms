package practise.com;

import java.util.Stack;

/* Name: Queue Using Stack Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement the functionality of the Queue using two stack in an efficient way
 */
public class QueueUsingStackMemory {
  private Stack<Integer> s1 = new Stack<Integer>();
  private Stack<Integer> s2 = new Stack<Integer>();
  
  public void push(int x){
	  s1.push(x);
  }
  public void pop(){
	  if( !s2.isEmpty() ){
		  	s2.pop();
		  	return;
	  }
		  	
	  
	  while( !s1.isEmpty() )
		  	s2.push( s1.pop() );
	  if(!s2.empty())
		  	s2.pop();
	  
}
   public int peek(){
	  if( !s2.isEmpty() ){
		  return s2.peek();
		  	
	  }
	  while( !s1.isEmpty() )
		  	s2.push( s1.pop() );
	  return s2.peek();
}
  public boolean empty(){
	  if(s1.isEmpty() && s2.isEmpty())
		  	return true;
	  else
		  return false;
  }
  public static void main(String args[]){
	  QueueUsingStackMemory qt = new QueueUsingStackMemory();
	  qt.push(1);
	  qt.peek();
	  qt.pop();
	  qt.pop();
	  //qt.pop();
	  
	  
  }
}
