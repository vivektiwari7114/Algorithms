package practise.com;

import java.lang.reflect.Constructor;

import java.lang.reflect.*;

public class JavaReflections {
	public static void main(String args[]){
		StudentRecord s1 = new StudentRecord("Vivek", 26);
		//s1.getDetails();
		
		try{
			Method method = s1.getClass().getDeclaredMethod("getDetails",String.class,Integer.class);
			method.invoke(s1, "Rahul", 48);
		
		
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

class StudentRecord {
	private String name;
	private int id;
	public StudentRecord (String name, Integer id){
		this.name = name ;
		this.id = id;
	}
	public void getDetails(String name , Integer id){
		System.out.println(name + " "+ id);
	}
	
}