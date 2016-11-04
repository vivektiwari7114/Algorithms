package snappractise;

public class PrivateConstructor {
	public static void main(String args[]){
		PrivateC c1 = PrivateC.getObject();
		System.out.println(c1.x);
	}

}
class PrivateC{
	int x;
	private PrivateC(){
		this.x = 2;
	}
	public static PrivateC getObject(){
		PrivateC c1 = new PrivateC();
		return c1;
	}
	
}
