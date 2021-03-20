package practise.com;

/* Name: Find Minimum Difference 
 * Parameters: Not Applicable
 * Return :Void
 * Function: Given two arrays find minimum difference
 */
public final class SmallestDifference {
	public static void main(String args[]){
		int a[] = {1,3,15,11,2};
		int b[] = {23,127,235,19,8};
		
		int l1 = a.length;
		int l2 = b.length;
		int min = Integer.MAX_VALUE;
		for(int i=0; i < l1; i++){
			for(int j=0; j < l2; j++){
				int diff = a[i] - b[j];
				if(diff > 0){
					if(min > diff)
						min = diff;
				}
				
			}
		}
		System.out.println(min);
	}

}
