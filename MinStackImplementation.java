package practise.com;

/* Name: MinStack Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement Push, Pop and getMinElements() in O(1) time
 */
public class MinStackImplementation {
	private NodeSM top;
	
	public void push(int val){
		if(top == null)
			top = new NodeSM(val,val);
		else{
			NodeSM temp = new NodeSM(val, Math.min(val, top.minValue));
			temp.next = top;
			top = temp;
		}
	}
	public int getMin(){
		return top.minValue;
	}
	public int pop(){
		if(top == null){
			System.out.println("Stack is Empty");
			return 0;
		}else{
			int data = top.data;
			top = top.next;
			return data;
		}
	}
	public static void main(String args[]){
		MinStackImplementation st = new MinStackImplementation();
		st.push(500);
		st.push(100);
		st.push(12);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(34);
		System.out.println(st.getMin());
		
	}
	

}
class NodeSM{
	public int data;
	public int minValue;
	public NodeSM next;
	public NodeSM(int data, int min){
		this.data = data;
		this.minValue = min;
	}
}
