package practise.com;

import java.util.ArrayList;
import java.util.List;

import com.sun.beans.finder.FieldFinder;

import java.util.LinkedList;

/* Name: Binary Search  Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement a Binary Search Tree
 */
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
	public List<LinkedList<NodeT>> GenerateListAtLevels(NodeT root){
		int level =0;
		List<LinkedList<NodeT>> result = new ArrayList<LinkedList<NodeT>>();
		LinkedList<NodeT> temp = new LinkedList<NodeT>();
		temp.add(root);
		result.add(level, temp);
		
		while(true){
			temp = new LinkedList<NodeT>();
			List<NodeT> oneUpList = result.get(level);
			for(int i=0; i< oneUpList.size(); i++){
				NodeT prev = oneUpList.get(i);
				if(prev.left != null) temp.add(prev.left);
				if(prev.right != null) temp.add(prev.right);	
			}
			if(temp.size()!= 0) 
				result.add(++level, temp);
			else
				break;
	}
		
		return result;
	}
	public NodeT findNextNode(NodeT root, int val, int flag){
		if(root !=null){
			findNextNode(root.left, val, flag);
			if(root.data == val)
					flag = 1;
			if(flag == 1)
				return root;
			findNextNode(root.right, val, flag);
			return null;
			
		}else
			return null;
	}
	public void  RootToLeafPath(NodeT root, List<ArrayList<Integer>> result, ArrayList<Integer> curr, int sum){
		
		sum = sum - root.data;
		curr.add(root.data);
		if(sum ==0 && root.left == null && root.right ==null){
			result.add(curr);
			return;
		}
		if(root.left != null){
			
			ArrayList<Integer> temp = new ArrayList<Integer>(curr);
			RootToLeafPath(root.left, result, temp, sum);
			
			
		}
		if(root.right != null){
			ArrayList<Integer> temp = new ArrayList<Integer>(curr);
			RootToLeafPath(root.right, result, temp, sum);
			
			
		}
}
public static void main(String args[]){
		
		ImplementBinarySearchTree bt = new ImplementBinarySearchTree();
		bt.add(10);
		bt.add(5);
		bt.add(15);	
		bt.add(2);
		bt.add(8);
		bt.add(12);
		bt.add(22);
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> curr = new ArrayList<Integer>();
		bt.RootToLeafPath(bt.head, result, curr,15);
		
		System.out.println(result);
		//System.out.println("Node Value is "+bt.findNextNode(bt.head, 2,0).data);
		//bt.add(40);bt.add(53);bt.add(17);bt.add(11);
		//bt.displayInOrder(bt.head);
		//System.out.println( "Height is: "+bt.findHeight(bt.head) );
		//List<LinkedList<NodeT>> res = bt.GenerateListAtLevels(bt.head);
		//System.out.println("Size of Entire List "+res.size());
		//System.out.println("Size of Specified List "+res.get(3).size());
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
