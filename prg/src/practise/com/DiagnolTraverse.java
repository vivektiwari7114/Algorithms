/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;
import java.util.*;


/**
 * @author VivekTiwari
 *
 */
public class DiagnolTraverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int matrix[][] = new int[][] {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
			List<Integer> list = new ArrayList<Integer>();
			
			int sum = (matrix.length - 1) + (matrix[0].length - 1);
		
		    for( int i=0; i <= sum ; i++){
		    	
		    	
		    	if( i%2 != 0){
			    	int start =0, end = i;
			    	System.out.println("SUM "+i );
			    	while (start + end <= i && start < matrix.length && end >= 0){
			    		
			    		if(start < matrix.length && end < matrix[0].length)
				    			System.out.println(start + " : "+ end);
				    		
			    
			    		start ++;
			    		end --;
			    		}
		    	}else{
		    		
		    		int start =i, end = 0;
			    	System.out.println("SUM "+i );
			    	while (start + end <= i && start >= 0 && end < matrix[0].length){
			    		
			    		if(start < matrix.length && end < matrix[0].length)
				    			System.out.println(start + " : "+ end);
				    		
			    
			    		start --;
			    		end ++;
			    		}
		    		
		    	}
		    	
		    }
			
			
			
			
	}
	

}
