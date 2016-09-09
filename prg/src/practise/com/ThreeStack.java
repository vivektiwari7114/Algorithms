package practise.com;

import java.util.ArrayList;
import java.util.List;

/* Name: ThreeStack Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement three stack by using array
 */
public class ThreeStack {
	private int stackSize = 5;
	private int  stack[] = new int[stackSize * 3];
	private int top[] = {-1,-1,-1};
	
	public void push(int stackNum, int val){
		int index = stackNum * stackSize + top[stackNum]+1;
		
		if( index >= (stackNum + 1)* stackSize ){
			System.out.println("Maximum Size reached");
			return;
		}	
		top[stackNum]++;
		stack[index] = val;
		
	}
	public void display(int stackNum){
		
		int index = top[stackNum];
		while(index >= 0){
		int logicalI = stackNum * stackSize + index;
		int value = stack[logicalI];
		System.out.print(value + " ");
			index --;
		}
	}
	public void pop(int stackNum){
		int LogicalI = (stackSize * stackNum) + (top[stackNum]);
		if(LogicalI == -1){
			System.out.println("Stack is Empty");
			return;
		}
		top[stackNum]--;
		stack[LogicalI] = 0;
	}
	public int peek (int stackNum){
		int LogicalI = (stackSize * stackNum) + (top[stackNum]);
		return  stack[LogicalI];
		
	}
	public boolean empty(int stackNum){
		if(top[stackNum] == -1 )
				return true;
		else
			return false;
	}
	public static void main(String args[]){
		ThreeStack st = new ThreeStack();
		st.push(1,4);st.push(1,4);st.push(1,4);st.push(1,4);st.push(1,4);
		st.push(0,4);
		
		
	
	
		//st.display(1);
	}
	

}
