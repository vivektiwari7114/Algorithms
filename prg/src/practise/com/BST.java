package practise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BST {
	public  Node root;
	//public int count;
	public BST(){
		this.root = null;
	}
	public void insert(int key ){
		if(root == null){
			Node newNode = new Node(key);
			this.root = newNode;
			return;
		}
		
		Node cp = this.root;
		
		Node parent = null;
		while(true){
			parent = cp;
			
			if(key < cp.key){
				
				cp = cp.left;
				if(cp == null){
					Node newNode = new Node(key);
					parent.left = newNode;
					return;
					
				}
			}else{
				
				cp = cp.right;
				
				if(cp == null){
					
					Node newNode = new Node(key);
					parent.right = newNode;
					return;
					
					
				}
				
			}
			
		}
		
	}
	
	
	public void deleteNode(int value){
		//System.out.println(root.key);
		Node current = root;
		Node parent = root;
		boolean isLeft = false;
		if(root == null)
				return ;
		while(current.key != value){
			parent = current;
			if(current.key > value){
				isLeft = true;
				current = current.left;
			}else{
				isLeft = false;
				current  = current.right;
			}
			if(current == null)
					return ;
			}
		// Node to be delete dont have any children
		if(current.left == null && current.right == null){
			if(current == root)
					root = null;
			else if(isLeft == false)
					parent.right = null;
			else
				parent.left = null;
		}
		// Node to be delete has only one children
		if(current.right == null){
			if(current == root)
				root = root.left;
			else if(isLeft == true)
				parent.left = current.left;
			else
				parent.right = current.left;
		}
		if(current.left == null){
			if(current == root)
				root = root.right;
			else if(isLeft == true)
				parent.left = current.right;
			else
				parent.right = current.right;
			
		}
		//If node to be delete has two child
		if(current.left != null && current.right != null){
			Node successor = getSuccessor(current);
			current.key =  successor.key; 
			
		}
		
	}
	
	public Node getSuccessor(Node deleteNode){
		
		
		Node current = deleteNode.right;
		
		Node sP = null;;
		Node s = null;
		while(current != null){
			System.out.println("DeletNode "+current.key );
			sP = s;
			s= current;
			current = current.left;
			
		}
		if(sP == null)
				sP = deleteNode;
		
		//System.out.println("Sp Left :"+sP.key);
		sP.left = null;
		return s;
		
	}
	
	public boolean find_iterative(int value){
		Node cp = root;
		while(cp != null){
			if(cp.key == value)
					return true;
			else if(value < cp.key)
					cp = cp.left;
			else 
				cp = cp.right;
		}
		return false;
	}
	public boolean find_recursion(Node root, int value){
		
		if(root == null)
				return false;
		if(root.key == value)
				return true;
		else if(value < root.key)
				return find_recursion(root.left, value);
		else
				return find_recursion(root.right, value);
	
	}
	public Node insert_recur(Node r, int val){
		if(r == null)
				r = new Node(val);
		else if(val <= r.key)
			r.left = insert_recur(r.left, val);
		else
			r.right = insert_recur(r.right, val);
		return r;
	}
	
	public void generate123(Node root, int val){
		if(this.root == null){
				this.root = new Node(2);
				return ;
		}
		Node current = this.root;
		Node parent = null;
		while(true){
			parent = current;
			if(val <= current.key){
				if(current.left == null){
					parent.left = new Node (val);
					return;
				}
			}else{
				if(current.right == null){
					parent.right = new Node (val);
					return;
				}
				
			}
		}
				
				
		
		
		
	}
	public int countNumberOfNodes(Node node, int count){
		if(node != null){
			count = countNumberOfNodes(node.left, count);
			count ++;
			count = countNumberOfNodes(node.right, count);
			
		}
		return count;
	}
public void display (Node node){
		
		if(node != null){
			
			display(node.left);
			System.out.println("Value "+node.key);
			display(node.right);
		}
	}
public void postOrder(Node node){
	if(node != null){
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.key);
	}
}

public int maxDepth(Node node){
	if(node != null){
		int lLength = maxDepth(node.left);
		int rLength = maxDepth(node.right);
		return(Math.max(lLength,rLength) + 1);
	}else{
		return(0);
	}
}
public Node minValue(Node node){
	if(node.left != null){
		node= minValue(node.left);	
		}else{
	return node;
		}
	return node;
}

public Node maxValue(Node node){
	if(node.right != null){
		node= maxValue(node.right);	
		}
	return node;
	
}
public boolean hasPath(Node node, int sum){
	if(node != null){
			sum = sum - node.key;
			if(sum == 0 && (node.left == null && node.right == null))
				return true;
			else
				return(hasPath(node.left, sum) || hasPath(node.right,sum));

	
}else 
		return false;
}

//MOdified for level order traversal
public boolean IterativeHasPath(Node node, int sum){
	 if(node != null){
		 LinkedList<Node> nodes = new LinkedList<Node>();
		 LinkedList<Integer> values = new LinkedList<Integer>();
		 nodes.add(node);
		 values.add(node.key);
		
		 while(!nodes.isEmpty()){
			 Node curr = nodes.remove();
			 int currSum = values.remove();
			 if(currSum == sum && curr.left == null && curr.right == null )
				 	return true;
			 
			 if(curr.left != null){
				 nodes.add(curr.left);
				values.add(currSum + curr.left.key);
			 }
			 if(curr.right != null){
				 nodes.add(curr.right);
					values.add(currSum + curr.right.key);
					
			 }
		
			 
		 }
		
		 return false;
		 
	 }else
		 	return false;
}
public List<List> levelOrderTraversal(Node root){
	List<List> finalList = new ArrayList<List>();
	if(root != null){
		List<List> parentList = new ArrayList<List>();
		List<Integer> childList = new ArrayList<Integer>();
		
		LinkedList<Node>  curr = new LinkedList<Node>();
		LinkedList<Node> next = new LinkedList<Node>();
		curr.add(root);
		
		while(!curr.isEmpty()){
			Node pr = curr.remove();
			
			if(pr.left != null){
				next.add(pr.left);
			}
			if(pr.right != null){
				next.add(pr.right);
			}
			childList.add(pr.key);
			if(curr.isEmpty()){
				curr = next;
				next = new LinkedList<Node>();
				parentList.add(childList);
				childList = new ArrayList<Integer>();
			}
		}
		System.out.println(parentList);
		//System.out.println(parentList.size());
		for (int i=parentList.size()-1 ; i>=0;i--){
			
            finalList.add(parentList.get(i));
		}
		return finalList;
		
	}else
			return finalList;
	
	
}
public boolean isBalance(Node node){
	if(node != null){
	int left =  findHeight(node.left);
	int right = findHeight(node.right);
	System.out.println("Key "+node.key);
	System.out.println("Left "+left);
	System.out.println("right "+right);
	if(Math.abs(left - right) > 1 )
		return false;
	else
		return (isBalance(node.left) && isBalance(node.right));
	}else
		return true;
}
public int findHeight(Node node){
	if(node != null){
		//System.out.println("Value" +node.key);
		int left = findHeight(node.left);
		int right = findHeight(node.right);
		/*System.out.println("Node Value"+node.key);
		System.out.println("Left"+left);
		System.out.println("Right"+right);
		System.out.println("******************************");*/
		
		return (Math.min(left, right)+1);
		
		
	}else 
		return -1;
}
public void invertTree(Node node){
	if(node != null){
		invertTree(node.left);
         invertTree(node.right);
            
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            
        
	
	}
}

public int shortestPath(Node node){
	if(node != null){
		int left = findHeight(node.left);
		int right = findHeight(node.right);
		System.out.println("Left"+ left);
		System.out.println("Right"+ right);
		return (Math.max(left, right) +1);
	}else
			return 0;
}
public void iterInvertTree(Node node){
	Queue<Node> q = new LinkedList<Node>();
	q.add(node);
	
	while(!q.isEmpty()){
		Node p = q.poll();
		Node temp = p.left;
		p.left = p.right;
		p.right = temp;
		if(p.left != null)
				q.add(p.left);
		if(p.right != null)
			q.add(p.right);
		
	}
	
	
}
public void ancestor(Node node, int a, int b){
	Queue<Node> q = new LinkedList<Node>();
	q.add(node);
	Node f1 = null;
	Node f2 = null;
	while(!q.isEmpty()){
		Node p = q.poll();
		if(p.key == a)
			f1 = p;
		if(p.key == b)
			f2 = p;
		if(p.left != null)
			q.add(p.left);
		if(p.right != null)
			q.add(p.right);
	}
}

	public static void main(String args[]){
		BST b = new BST();
		int count = 0;
		/*b.insert(1);
		b.insert(-2);
		b.insert(-3);
		b.insert(1);
		b.insert(3);
		b.insert(-2);
		b.insert(-1);*/
		b.insert(10);
		b.insert(5);
		b.insert(15);
		b.insert(2);
		
		//b.display(b.root);
		//b.invertTree(b.root);
		//b.display(b.root);
		b.findHeight(b.root);
		//b.display(b.root);
		System.out.println(b.shortestPath(b.root));
		
		
		
		
		/*System.out.println("************Before Delete***************");
		b.display(b.root);
		b.deleteNode(20);
		System.out.println("************After Delete******************");
		b.display(b.root);*/
		//b.display(b.root);
		//c.display(c.root);
		
	}
}

class Node{
	public int key;
	public Node left;
	public Node right;
	public Node(int key){
		this.key = key;
	}
}
