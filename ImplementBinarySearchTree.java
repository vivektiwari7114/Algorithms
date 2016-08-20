package practise.com;

public class ImplementBinarySearchTree {
	private NodeT  head; 
	
	public void add(int val){
		//System.out.println("Value "+val);
		//System.out.println("Head "+head);
		
		if(head == null)
				head = new NodeT(val);
		else{
			NodeT curr = head;
			while (curr != null){
				if(val <= curr.data ){
						if(curr.left == null){
								curr.left = new NodeT(val);
								break;
						}
						curr = curr.left;
				}else{
					if(curr.right == null){
						curr.right = new NodeT(val);
						break;
					}
				else
					curr = curr.right;
				}
			}
		}
	}
	public void displayInOrder(NodeT curr){
		if(curr!= null){
		displayInOrder(curr.left);
		System.out.print("  "+curr.data);
		displayInOrder(curr.right);
		}
	}
	public boolean isBinary(NodeT curr){
		if(curr != null){
			int left = findHeight(curr.left);
			int right = findHeight(curr.right);
			System.out.println(Math.abs(left - right));
			if( Math.abs(left-right) > 1 )
					return false;
			else
				return ( isBinary(curr.left) && isBinary(curr.right) );
		}else
			return true;
	}
	public int findHeight(NodeT curr){
		if(curr != null){
			int left = findHeight(curr.left);
			int right = findHeight(curr.right);
			return ( Math.max(right, left) +1 );
			
		}else
			return -1;
	}
public static void main(String args[]){
		
		ImplementBinarySearchTree bt = new ImplementBinarySearchTree();
		bt.add(10);
		bt.add(5);
		bt.add(2);	
		
		//bt.add(40);bt.add(53);bt.add(17);bt.add(11);
		//bt.displayInOrder(bt.head);
		//System.out.println( "Height is: "+bt.findHeight(bt.head) );
	System.out.println(bt.isBinary(bt.head));
		//System.out.println(bt.findHeight(bt.head));
		
	}
	

}

class NodeT{
	public int data;
	public NodeT left;
	public NodeT right;
	public NodeT( int d){
		data = d;
		left = null;
		right = null;
	}
}
