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
		
		if( index < 0 ){
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
		top[stackNum]--;
		stack[LogicalI] = 0;
	}
	public int peek (int stackNum){
		int LogicalI = (stackSize * stackNum) + (top[stackNum]);
		return  stack[LogicalI];
		
	}
	public static void main(String args[]){
		ThreeStack st = new ThreeStack();
		
		st.push(0, 12);
		st.push(0, 13);;
		st.push(0, 5);
		st.push(0, 8);
		st.push(1, 44);
		st.push(1, 63);
		st.push(1, 89);
		st.push(2, 100);
		st.push(2, 121);
		st.push(2, 131);
		st.push(2, 140);
		st.push(2, 180);
		//System.out.println(st.peek(2));
		//st.display(2);
		st.pop(0);
		st.pop(1);
		st.pop(0);
		st.display(0);
	}
	

}
