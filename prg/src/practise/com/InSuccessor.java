package practise.com;

public class InSuccessor {
	private TreeNode root;
	public void insert(int val){
		if(root == null)
			root = new TreeNode(val);
		else{
			
			TreeNode curr = root;
			while(curr != null){
			if(val <= curr.data){
				if(curr.left == null){
					curr.left = new TreeNode(val, curr);
					break;
				}
				else
					curr = curr.left;
			}else{
				if(curr.right == null){
					curr.right = new TreeNode(val, curr);
					break;
				}
				else
					curr = curr.right;
				}
		}
			
	}
		
}
	
	public void displayInOrder(TreeNode curr){
		if(curr!= null){
		displayInOrder(curr.left);
		System.out.print("  "+curr.data);
		System.out.println();
		if(curr.parent != null)
			System.out.print(" Parent Data "+curr.parent.data);
		System.out.println();
		displayInOrder(curr.right);
		}
	}
	
	
	
	public void getInOrderSuccessor(TreeNode curr){
		
		
		if(curr.right != null){
			TreeNode res =getMin(curr.right);
			System.out.println("result is: "+res.data);
			System.exit(0);
		}else{
			TreeNode p= curr.parent;
			while(p!=null &&  p.left != curr){
				curr = p;
				p = p.parent;
			}
			if(p!=null)
				System.out.println("Result is: "+p.data);
			else
				System.out.println("Null");
			System.exit(0);
		}
	}
	public TreeNode getTerseInOrderSuccessor(TreeNode find){
		TreeNode res = null;
		while(root!= null){
			if(root.data > find.data){
				res = root;
				root = root.left;
			}else
				root = root.right;
		}
		return res;
	}
	public TreeNode getTerseInOrderPredecssor(TreeNode find){
		TreeNode res = null;
		while(root!= null){
			if(root.data < find.data){
				res = root;
				root = root.right;
			}else
				root = root.left;
		}
		return res;
	}
	public TreeNode getMin(TreeNode curr){
		while(curr.left != null)
			curr = curr.left;
		
		return curr;
		
	}
	public boolean isSubtree(TreeNode t, TreeNode s){
		//System.out.println(t.data);
		//System.out.println(s.data);
		if( s== null)
				return true;
		if(t == null)
				return false;
		if(isSame(t, s))
				return true;
		return (isSubtree(t.left, s) || isSubtree(t.right, s));
	}
	
	public boolean isSame(TreeNode t, TreeNode s){
		//System.out.println("go");
		if(t == null && s== null )
				return true;
		if(s == null)
				return true;
		
		if(t == null)
			return false;
		if(t.data != s.data)
			return false;
		return( isSame(t.left, s.left) && isSame(t.right, s.right));
	}
	
	public static void  main(String args[]){
		InSuccessor t = new InSuccessor();
		t.insert(10);
		t.insert(5);
		t.insert(15);	
		t.insert(2);
		t.insert(8);
		t.insert(12);
		t.insert(22);
		
		InSuccessor s = new InSuccessor();
		s.insert(10);
		s.insert(5);
		s.insert(15);	
		s.insert(2);
		
		
		
		
		InSuccessor test = new InSuccessor();
		System.out.println( "result is: "+test.isSubtree(t.root, s.root) );
		
		
		
		
	}
	

}
class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	public TreeNode(int data){
		this.data = data;
	}
	public TreeNode(int data,TreeNode parent){
		this.data = data;
		this.parent = parent;
	}
}