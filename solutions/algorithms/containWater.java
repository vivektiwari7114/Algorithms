package practise.com;

public class containWater {
	/* Name: Contain Water
	 * Parameters: Not Applicable
	 * Return :Not Applicable
	 * Function: Given a set of co-ordinates represented as wall find out the maximum water it can hold
	 */
	public static void main(String args[]){
		int height[] ={4,1,10,5};
		 int maxarea = 0, l = 0, r = height.length - 1;
	        while (l < r) {
	        	System.out.println("l "+l+" r "+r);
	            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
	            System.out.println("resultant Area "+Math.min(height[l], height[r]) * (r - l));
	            System.out.println("MaxArea "+maxarea);
	            if (height[l] < height[r])
	                l++;
	            else
	                r--;
	        }
	        System.out.println("Max Area"+maxarea);
	        
	}

}
