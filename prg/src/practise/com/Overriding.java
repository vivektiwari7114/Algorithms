package practise.com;

public class Overriding {
	public static void main(String args[]){
		
		/*Vehicle v1 = new Vehicle();
		v1.move();
		
		Van van2 = new Van();
		van2.move();*/
		
		Vehicle v1 = new Van();
		v1.move();
	}

}

class Vehicle {
	public void move(){
		System.out.println("Vehicle Class");
	
	}
	
}

class Van extends Vehicle {
	public void move(){
		super.move();
		System.out.println("Van Class");
		
	}
	
	
	
}
