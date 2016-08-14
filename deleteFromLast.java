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
	public void displayNfromlast(int n){
		if(head == null){
			System.out.println("Linst is empty");
			return;
		}
		NodeL ptr = head;
		int length = 0;
		while(ptr != null){
			length ++;
			ptr= ptr.next;
		}
		int elem = length -(n-1);
		if(elem < 1){
			System.out.println("More than the length of the list");
			return;
		}
		NodeL curr = head;
		int count = 1;
		while(count != elem ){
			curr = curr.next;
			count++;
		}
		System.out.println("Result: "+curr.data);
	}
	public void displayFromLastMethod2(int n ){
		if(head == null){
			System.out.println("Linst is empty");
			return;
		}
		NodeL p1 = head;
		NodeL p2 = head;
		int count = 0;
		while(count != (n-1)){
			p2 = p2.next;
			count++;
		}
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println("Result :"+p1.data);
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
		lt.displayFromLastMethod2(6);
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
