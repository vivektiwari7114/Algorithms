package practise.com;


/* Name:Binary Search Tree
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Various Binary Search tree Methods
 */
public class BinarySearchTree {
	private BinaryNodes root;
	public void insertIntoNode(int val){
		if(root == null){
			root = new BinaryNodes(val);
			return;
		}else{
			BinaryNodes next = root;
			BinaryNodes parent = null;
			while(true){
				if(val < next.val){
					parent = next;
					next = next.left;
					if(next == null){
						parent.left = new BinaryNodes(val);
						return;
					}
				}else{
					parent = next;
					next = next.right;
				if(next == null){
					parent.right = new BinaryNodes(val);
					return;
				}
					
				}
			}
		}
		
	}
	public  void display( BinaryNodes root){
		if(root != null){
			display(root.left);
			System.out.println(root.val);
			display(root.right);
			
		}
	}

	public static void main(String[] args) {
	
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertIntoNode(10);
		bst.insertIntoNode(5);
		bst.insertIntoNode(15);
		bst.insertIntoNode(2);
		bst.insertIntoNode(8);
		bst.insertIntoNode(12);
		bst.insertIntoNode(30);
		bst.display(bst.root);

	}

}
class BinaryNodes{
	int val;
	BinaryNodes left;
	BinaryNodes right;
	public BinaryNodes(int val){
		this.val = val;
		
		this.left = null;
		this.right = null;
	}
}