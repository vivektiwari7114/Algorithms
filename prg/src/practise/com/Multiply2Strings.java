package practise.com;

public class Multiply2Strings {
	public static void main(String rags[]){
	String num1 = "26";
	String num2 = "41";
	 String n1 = new StringBuilder(num1).reverse().toString();
	    String n2 = new StringBuilder(num2).reverse().toString();
	 System.out.println("first STring"+n1);
	 System.out.println("second STring "+n2);
	    int[] d = new int[num1.length()+num2.length()];
	 
	    //multiply each digit and sum at the corresponding positions
	    for(int i=0; i<n1.length(); i++){
	        for(int j=0; j<n2.length(); j++){
	        	System.out.println(n1.charAt(i)-'0');
	        	System.out.println(n2.charAt(j)-'0');
	            d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
	        }
	    }
	    System.out.println("Final");
	    for(int i : d)
	    		System.out.println(i);
	 

}
}
