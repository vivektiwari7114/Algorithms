package practise.com;

import java.util.ArrayList;
import java.util.List;

/* Bounded Convert to hex
 * Parameters: NA
 * Return :NA
 * Function:Given an integer convert the number to hexadecimal equivalent
 */
public class ConvertToHex {
	public static void main(String args[]){
		int n = -1;
		 List<String > lt = new ArrayList<String>();
	        lt.add("0"); lt.add("1"); lt.add("2"); lt.add("3");
	         lt.add("4"); lt.add("5"); lt.add("6"); lt.add("7");
	          lt.add("8"); lt.add("9"); lt.add("a"); lt.add("b");
	           lt.add("c"); lt.add("d"); lt.add("e"); lt.add("f");
	           StringBuilder sb = new StringBuilder();
	    /* long t = n & 0x00000000ffffffffL;
	     while( t > 0){
	    	 int s = (int)(t %16);
	    			// System.out.println(s);;
	    	 sb.append(lt.get(s));
	    	 t = t /16;
	     }
	    System.out.println(  sb.reverse()  );
	*/
	           while(n != 0){
	        	  //System.out.println(Integer.toBinaryString(n));
	        	   int t = n & 0b1111;
	        	   sb.append(lt.get(t));
	        	   n =  n  >>> 4;
	        	   //System.out.println();
	           }
	           System.out.println(  sb.reverse()  );
	       	
	}

}
