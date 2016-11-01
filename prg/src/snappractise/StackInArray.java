package snappractise;

public class StackInArray {
	NodeStack store[] = new NodeStack[15];
	int indexUsed = 0;
	int pointer [] = {-1,-1,-1};
	public static void main(String args[]){
		StackInArray s1 = new StackInArray();
		s1 .push(4, 0);
		s1 .push(5, 1);
		s1 .push(10, 2);
		s1 .push(100, 2);
		//s1.display();
		//System.out.println( s1.pop(0) );
		s1.pop(2);
		s1.pop(2);
		s1.display();
		
		
	}
	public void push(int data, int stackNumber){
		int prev = pointer[stackNumber];
		pointer[stackNumber] = indexUsed;
		indexUsed ++;
		store[pointer[stackNumber]] = new NodeStack(data, prev);
		
		
		
	}
	public void display(){
		for(int i=0; i < store.length; i++){
			if(store[i] != null)
				System.out.print(store[i].data +" ");
		}
	}
	public  int  pop(int stackNumber){
		int curr = pointer[stackNumber];
		int popItem = store[curr].data;
	
		pointer[stackNumber] = store[curr].prev;
		store[curr] = null;
		indexUsed--;
		return popItem;
		
	}

}
class NodeStack{
	int data;
	int prev;
	public NodeStack(int data, int prev){
		this.data = data;
		this.prev = prev;
	}
}
