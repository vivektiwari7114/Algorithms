package practise.com;

/* Name: Stack Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Push, Pop and Display Function in a stack
 */
public class StackImplementation {
	private NodeS top;
	public void push(int val){
		if(top == null)
				top = new NodeS(val);
		else{
			NodeS temp = new NodeS(val);
			temp.next = top;
			top = temp;
		}
	}
	public int pop(){
		if(top == null){
			System.out.println("There are no elements in the stack");
			return 0;
		}else{
			int data = top.data;
			top = top.next;
			return data;
		}
	}
	public void display(){
		NodeS curr = top;
		if(curr == null){
			System.out.println("There are no elements in the stack");
			return;
		}else{
			while(curr != null){
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
	}
	/* Name: Driver Program
	 * Parameters: Not Applicable
	 * Return :Not Applicable
	 * Function: Push, Pop and Display Function in a stack
	 */
	public static void main(String args[]){
		StackImplementation st = new StackImplementation();
		st.push(5);
		st.push(15);
		st.push(12);
		st.push(60);
		st.display();
		System.out.println("");
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}

}
class NodeS{
	public int data;
	public NodeS next;
	public NodeS(int data ){
		this.data  = data;
		this.next = null;
	}
}
