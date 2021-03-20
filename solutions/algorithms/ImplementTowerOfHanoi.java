package practise.com;

public class ImplementTowerOfHanoi {
	public static void main(String args[]){
		int n = 3;
		tower(n, "S", "D", "A");

	}
	public static void tower(int n, String source, String destination, String auxillary){
		if(n == 0)
				return;
		tower(n-1, source, auxillary, destination);
		System.out.println("Move Disk from "+n+ " "+source+" to "+destination);
		tower(n-1, auxillary, destination, source);
			

	}

}
