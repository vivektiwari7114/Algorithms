package practise.com;


/* Name: Difference Between shallow and Deep copy
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Difference between shallow and deep copy by using copy constructor
 */
public class Person {
	public Address a1;
	public Name n1;
	public Person(Address a, Name n){
		a1= a;
		n1 = n;
	}
	//Deep copy using copy constructore
	public Person(Person p){
		this.a1 = new Address(p.a1);
		this.n1 = new Name(p.n1);
		
	}
public static void main(String args[]){
	
	Address mAd = new Address(219, "720W 27 Street");
	Name mName = new Name("Jyoti", "tiwari");
	Person mother = new Person(mAd, mName);
	Person son = new Person(mother);
	
	son.n1.fName = "Vivek";
	
	System.out.println(son.n1.fName);
		
	}
	

}

class Address{
	public int aptNo;
	public String  street;
	public Address(int a, String s){
		aptNo = a;
		street = s;
	}
	//Copy Constructor
	public Address(Address a){
		this.aptNo = a .aptNo;
		this.street = a.street;
	}

}
class Name{
	public String fName;
	public String lName;
	public Name(String f, String l){
		fName = f;
		lName = l;
	}
	//Copy Constructor
	public Name(Name n){
		this.fName = n.fName;
		this.lName=n.lName;
	}
}
