package practise.com;

public class GenericBounded {
	public static void main(String args[]){
		Box<Integer> b1 = new Box<Integer>(3,4,5);
		System.out.println(b1.returnVolume());
		
		Box<Float> b2 = new Box<Float>(7.5f, 4.5f, 5.5f);
		System.out.println(b2.returnVolume());
		

		Box<Double> b3 = new Box<Double>(7.5, 4.5, 5.5);
		System.out.println(b3.returnVolume());
		
		/*Box<String> b4= new Box<String>("7.5", "4.5", "5.5");
		System.out.println(b4.returnVolume());*/
		
	}

}

class Box<T extends Number>{
	private T l;
	private T h;
	private T w;
	public Box(T l, T h, T w){
		this.l = l;
		this.h= h;
		this.w = w;
	}
	public double returnVolume(){
		return (l.doubleValue() * h.doubleValue() * w.doubleValue());
	}
	
}
