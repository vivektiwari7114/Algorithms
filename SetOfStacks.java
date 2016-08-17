package practise.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks {
	
  private List<Stack> st = new ArrayList<Stack>();
  private int stackSize = 2;
  public void push(int val){
	 
	  Stack last = getLastStack() ;
	  if(last == null || last.size() == stackSize){
		  last = new Stack();
		  last.push(val);
		  st.add(last);
	  }else
		  last.push(val);
  }
  //To Return the last Stack
   public Stack getLastStack(){
	   if(st.size() == 0)
		   	return null;
	   else
		   return st.get(st.size() - 1);
	   
 }
   public void display(){
	  // System.out.println("Stack Array SIze" + st.size());
	   int storeSize = st.size();
	  // System.out.println("Store Size "+storeSize);
	  Stack curr;
	   while(storeSize != 0){
		    curr = st.get(storeSize - 1);
	   while(!curr.isEmpty()){
		   int data = (int)curr.pop();
		   System.out.println(data);
	   		}
	   storeSize--;
	   }
 }
   public int  pop(){
	   System.out.println("Stack Size "+st.size());
	   Stack curr = getLastStack();
	   if(curr  ==  null){
		   System.out.println("No more elements in the stack");
		   return -1;
	   }
	   int data = (int)curr.pop();
	   if(curr.size() == 0)
		   st.remove(st.size() - 1);
	   
	   return data;
 }
   public static void main(String args[]){
	   SetOfStacks los = new  SetOfStacks();
	   los.push(4);
	   los.push(45);
	   los.push(15);
	   los.push(12);
	   los.push(100);
	  
	   System.out.println(los.pop());
	  System.out.println(los.pop());
	  System.out.println(los.pop());
	   System.out.println(los.pop());
	   System.out.println(los.pop());
	   //los.pop();
	  // los.pop();
	   
	
	  
	  
	  // los.pop();
	 // los.display();
   }

}
