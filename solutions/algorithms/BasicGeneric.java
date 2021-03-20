package practise.com;

/* Basic Generic in java 
 * Parameters: NA
 * Return :NA
 * Function:Working of Generics In Java 
 */
public class BasicGeneric {
	public static void main(String args[]){
		GenericExample<String> go = new GenericExample<String>("Hello");
		go.printGeneric();
		
		GenericExample<Integer> go1 = new GenericExample<Integer>(48);
		go1.printGeneric();
		
		GenericExample<Integer> go2 = new GenericExample<Integer>(new Integer(89));
		go2.printGeneric();
		
		GenericExample<Float> go3 = new GenericExample<Float>(new Float(89.87));
		go3.printGeneric();
		
		
		GenericExample<Double> go4 = new GenericExample<Double>(new Double(89.87));
		go4.printGeneric();
		
		GenericExample<Double> go5 = new GenericExample<Double>(678.89);
		go5.printGeneric();
		
		
		GenericExample<Boolean> go6 = new GenericExample<Boolean>(new Boolean(true));
		go6.printGeneric();
	}
	

}
class GenericExample<T>{
	T refObject;
	public GenericExample(T param){
		this.refObject = param;
	}
	public void printGeneric(){
		System.out.println(this.refObject);
	}
}
