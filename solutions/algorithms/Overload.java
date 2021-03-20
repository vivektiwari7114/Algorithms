package practise.com;

public class Overload {
	public static void main(String args[]){
		Store s1 = new Store();
		System.out.println( s1.move("Vivek") );
		System.out.println( s1.move(4) );
	}
}

class Store{
	public String move(String s){
		return "String";
	}
	
	public int move(int s){
		return 5;
	}
}
