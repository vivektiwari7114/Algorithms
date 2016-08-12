package practise.com;

public class LinkedList {
	private NodeL head;
	private NodeL tail;
	// Insert into the LinkedList	
	public void insert(int val){
		if(this.head == null){
			NodeL temp = new NodeL(val);
			this.head = temp;
			this.tail = temp;
		}else{
			NodeL temp = new NodeL(val);
			this.tail.next = temp;
			this.tail = this.tail.next;
		}
		
	}
	// Print the elements of the linkedList
	public void displayElements(){
		System.out.println("");
		NodeL curr = this.head;
		if(curr == null)
				System.out.println("List is Empty");
		else{
			while( curr != null){
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
		
	}
	//Delete an element of the Linked List
	public void deleteElement(int val){
		NodeL dummy = new NodeL(0);
		NodeL main = dummy;
		dummy.next = head;
		while(dummy.next != null){
			if(dummy.next.data == val)
				dummy.next = dummy.next.next;
			else
				dummy = dummy.next;
			}
		this.head = main.next;
	}
	
	public static void main(String args[]){
		LinkedList lt = new LinkedList();
		lt.insert(40);
		lt.insert(4);
		lt.insert(12);
		lt.insert(4);
		lt.insert(1);
		
		
		lt.displayElements();
		lt.deleteElement(4);
		lt.displayElements();
	}
}

/* Name: Node Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Define Tempalte to store the node data structure
 */
class NodeL{
public int data;
public NodeL next;
public NodeL(int data){
	this.data = data;
	this.next = null;
}
}
