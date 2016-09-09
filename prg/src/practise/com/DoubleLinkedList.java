package practise.com;

/* Class Name: Double linked List
 * Parameters: NA
 * Return :Void
 * Function:  Insertion in a double linked list
 */
public class DoubleLinkedList {
	private NodeDL head;
	private NodeDL tail;
	
	public void addNode(int data){
		if(head == null){
			NodeDL temp = new NodeDL(data);
			head = temp;
			tail = temp;
		}else{
			NodeDL temp = new NodeDL(data);
			tail.next = temp;
			tail = temp;
		}
	}
	public void printNode(){
		NodeDL temp = this.head;
		while(temp != null){
			System.out.print(temp.data + " " );
			temp = temp.next;
		}
	}
	public static void main(String args[]){
		
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.addNode(1); 	dl.addNode(16); 	dl.addNode(21);  	dl.addNode(27);
		
		dl.printNode();
		
		dl.addNode(100); 	dl.addNode(167); 	
		
		dl.printNode();
		
	}

}

class NodeDL {
	int data;
	NodeDL next;
	NodeDL prev;
	public NodeDL(int data ){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
