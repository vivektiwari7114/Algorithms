package practise.com;

import java.util.Stack;

/* Name: MinStack Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement Push, Pop and getMinElements() in O(1) time with reduce Memory Requirement
 */
public class MinStackImplementation {
	private NodeSM top;
	private Stack<Integer> minSt;
		public MinStackImplementation(){
			minSt = new Stack<Integer>();
		}
	
	public void push(int val){
		if(top == null){
			top = new NodeSM(val);
			minSt.push(val);
		}
		else{
			NodeSM temp = new NodeSM(val);
			if(val  <= minSt.peek() )
				minSt.push(val);
			temp.next = top;
			top = temp;
		}
	}
	public int getMin(){
		return minSt.peek();
	}
	public int pop(){
		if(top == null){
			System.out.println("Stack is Empty");
			return 0;
		}else{
			int data = top.data;
			if(data == minSt.peek())
				minSt.pop();
			top = top.next;
			return data;
		}
	}
	public void display(){
		NodeSM curr = top;
		while(curr != null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	public static void main(String args[]){
		MinStackImplementation st = new MinStackImplementation();
		st.push(50);
		st.push(100);
		st.push(56);
		st.push(2000);
		st.push(50);
		st.pop();
		
		System.out.println("");
		System.out.println(st.getMin());
		
		
		
		
		
		
	}
	

}
class NodeSM{
	public int data;
	public NodeSM next;
	public NodeSM(int data){
		this.data = data;
	}
}
