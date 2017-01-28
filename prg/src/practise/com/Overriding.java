package practise.com;

public class Overriding {
	public static void main(String args[]){
		
		/*Vehicle v1 = new Vehicle();
		v1.move();
		
		Van van2 = new Van();
		van2.move();*/
		
		Van v1 = (Van)new Vehicle();
		v1.myName();
		
	}

}

class Vehicle {
	public void move(){
		System.out.println("Vehicle Class");
	
	}
	public void print(){
		System.out.println("Print");
	}
}

class Van extends Vehicle {
	public void move(){
		System.out.println("Van Class");
		
	}
	
	public void myName(){
		System.out.println("Vivek");
		
	}
	
}
