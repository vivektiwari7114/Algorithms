package practise.com;

import java.util.ArrayList;
import java.util.List;

/* Name: Pascal Number Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Generate Pascal Number sequence
 */
public class pascal {
	public static void main(String args[]){
		System.out.println(pascal(0));
		
		}
	public static int calculateCoeff(int i, int j ){
		int res = 1;
		if(j > i-j)
				j= i-j;
		for (int k =0; k < j ;k++){
			
			res *= (i-k);
			res /= (k+1);
		}
		return res;
	}
	public static  List<Integer> pascal(int rowIndex){
		 List<Integer> pre = new ArrayList<Integer>();
	        
	        if(rowIndex < 1)
	            return pre;
	            
	        pre.add(1);
	        
	            for(int i=2; i<= rowIndex; i++){
	                  List<Integer> curr = new ArrayList<Integer>();
	                  curr.add(1);
	                  for(int k =0 ; k< pre.size() -1 ; k++)
	                    curr.add( pre.get(k) + pre.get(k+1) );
	                  curr.add(1);
	                  pre = curr;
	                
	            }
	            
	            return pre;
		
	}

}