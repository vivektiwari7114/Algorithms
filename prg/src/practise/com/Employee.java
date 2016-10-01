package practise.com;



/* Name:Employee
 * Parameters: NA
 * Return :Employee Object
 * Function:Create the object of the constructor is private
 */

public class Employee {
	private int age;
	private String name;
	private Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String args[]){
		Student s1 = Student.getObject(12, "Tripti");
		s1.print(s1);
		
		Student s2 = Student.getObject(42, "Janki");
		s1.print(s2);
		
	}
}

class Student{
	private int roll;
	private String sName;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	private Student(int roll, String sName){
		this.roll = roll;
		this.sName = sName;
	}
	public static Student getObject(int roll, String name){
		
		return new Student(roll, name);
	}
	public static void  print(Student s1){
		System.out.println(s1.roll);
		System.out.println(s1.sName);
		
	}
}

