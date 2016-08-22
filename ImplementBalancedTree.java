package practise.com;

/* Name: Balanced Binary tree
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement a Balanced  Binary Tree from the given array
 */
public class ImplementBalancedTree {
	
	public static TreeNodeT  insertNodesInBinary(int arr[], int start, int end){
		System.out.println("Start "+start+"End: "+end);
		
		if(end < start)
				return null;
		int mid = start + (end - start)/2;
		
		TreeNodeT root = new TreeNodeT(arr[mid]);
		root.left = insertNodesInBinary(arr, start, mid-1);
		root.right = insertNodesInBinary(arr, mid+1, end);
		return root;
		
	}
	public static void display(TreeNodeT root){
		if(root!= null){
			display(root.left);
			System.out.print(root.data+" ");
			display(root.right);
		}
	}
	public static void main(String args[]){
		int arr[] = {30,23,61,42,15};
		TreeNodeT root = insertNodesInBinary( arr, 0, arr.length -1  );
		display(root);
		
	}

}
class TreeNodeT{
	public int  data;
	public TreeNodeT left;
	public TreeNodeT right;
	public TreeNodeT(int data ){
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
}
