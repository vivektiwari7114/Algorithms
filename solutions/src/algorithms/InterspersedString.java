package practise.com;

/* Class Name: Find String in Interspersed Array
 * Parameters: NA
 * Return :Void
 * Function:  Implement Modify Binary Search algorithm for find string
 */

public class InterspersedString {
	public static void main(String args[]){
		String in[] = {"adt","adz", "", "", "","bad"};
		String find = "";
		int l= in.length;
		if(in == null || l == 0){
			System.out.println("Undefined Array");
			System.exit(0);
		}
		//For Handling if the input is Empty string itself
		for(int i=0; i < l; i++){
			if(in[i] == ""){
				System.out.println(" Index is: "+i);
				System.exit(0);
			}
					
		}
		
				
		System.out.println(searchBinary(in, 0, l-1, find));
	}
	public static int searchBinary(String[] in, int l, int h, String key){
		
		if(l > h)
				return -1;
		while(l <=h && in[h] == "")
				h--;
		int mid = l + (h-l)/2;
		while(in[mid] == "")
				mid++;
		
		if( in[mid].compareTo(key) == 0 )
				return mid;
		else if( in[mid].compareTo(key) > 0)
			return searchBinary(in, l, mid-1, key);
		else
			if( in[mid].compareTo(key) > 0)
				return searchBinary(in, mid+1, h, key);
		
		return -1;
		
	}

}
