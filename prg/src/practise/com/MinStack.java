package practise.com;
import java.util.ArrayList;
import java.util.List;
public class MinStack {
	 private DataNode ds;
	 public MinStack() {
	       
	    }
	     public void push(int x) {
	    	
	       if(this.ds == null){
	    	   ds = new DataNode();
	    	  ds.setData(x,x);
	    	  ds.next = null;
	    }else{
	    	DataNode k = new DataNode();
	    	k.setData(x , Math.min(x,ds.getMin()));
	    	k.next = ds;
	    	ds = k;
	    	
	      }
	   }
	    public void display(){
	    	
	    }
	    public void pop() {
	    	ds = ds.next;
	    	
	  }
	   public int top() {
	       return ds.data;
	   }
	   public int getMin() {
	    	return ds.getMin();
	    }
	public static void main(String args[]){
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.display();
		System.out.println(minStack.getMin());  
		minStack.pop();
		System.out.println(minStack.top());    
		System.out.println(minStack.getMin());   
	}

}
class DataNode{
	public int data;
	public int minData;
	public DataNode next;
	public void setData(int x , int y){
		this.data = x;
		this.minData = y;
	}
	public int getMin(){
		return minData;
	}
	 public DataNode(){
		 this.data =0;
		 minData =0;
		 
	 }
	

}
