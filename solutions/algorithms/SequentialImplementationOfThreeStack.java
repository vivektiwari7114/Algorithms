package practise.com;

/* Name: Three Stack Implementation
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement push, pop operation in a Three different stack implemented using single array
 */
public class SequentialImplementationOfThreeStack {
	private int max_size = 10;
	private StackNode store[] = new StackNode[3 * max_size];
	private int indexUsed = 0;
	private int top[] = {-1,-1,-1};
	public void push(int stackNum, int val){
		int lastIndex = top[stackNum];
		store[indexUsed] = new StackNode(val, lastIndex);
		top[stackNum] = indexUsed;
		indexUsed++;
	}
	public int pop (int stackNum){
		int currIndex = top[stackNum];
		int value = store[currIndex].data;
		int lastIndex = store[currIndex].prev;
		top[stackNum]  = lastIndex;
		store[currIndex] = null;
		return value;
		}
	public static void main(String args[]){
		SequentialImplementationOfThreeStack st = new SequentialImplementationOfThreeStack();
		st.push(0,50);st.push(0,11);
		st.push(1,100);st.push(1,20);System.out.println(st.pop(1));
		st.push(2,300);
		
		System.out.println(st.pop(0));
		System.out.println(st.pop(1));
		
	}

}
class StackNode{
	public int data;
	public int prev;
	public StackNode(int d, int p){
		data = d;
		prev = p;
	}
}
