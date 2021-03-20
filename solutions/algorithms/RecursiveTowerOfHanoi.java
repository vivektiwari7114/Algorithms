package practise.com;

public class RecursiveTowerOfHanoi {
	public static void main(String args[]){
		RecursiveTowerOfHanoi obj = new RecursiveTowerOfHanoi();
		obj.tower(3,"S","D","A");
	}
	public void tower(int n , String source, String destination, String auxilary){
		if(n == 0)
				return;
		tower(n-1, source, auxilary, destination);
		System.out.println("Move disc "+ n + " from "+source +" to "+destination);
		tower(n-1, auxilary, destination, source);
	}

}
