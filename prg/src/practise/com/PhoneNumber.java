package practise.com;

import java.util.*;
/* Name: PhoneNumber Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Generate Phone Number sequence
 */
public class PhoneNumber {
	public static void main(String args[]){
		String digits = "23";
		 String nums[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	       LinkedList<String> lt = new LinkedList<String>();
	       if(digits.length() == 0)
	            return lt;
	         lt.add(""); 
	        for(int i=0; i < digits.length(); i++){
	            int content = digits.charAt(i) - '2';
	                int currLength = lt.size();
	            for(int j=0; j < currLength; j++){
	                String curr = lt.pop();
	                 String currString = nums[content];
	                for(int k =0; k < currString.length(); k++){
	                   
	                    lt.add(curr + currString.charAt(k) );
	                   System.out.println(lt);
	                }
	            }
	        }
	        return lt;
}
}