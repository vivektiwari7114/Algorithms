package practise.com;

/* Class Name : BubbleSort
 * Parameters: NA
 * Return :Sorted Array In Decreasing Order
 * Function: Sort Array in increasing order
 */
public class BubbleSort {
	public static void main(String args[]){
		int a[] = {10,4,6,3,2,1,};
		int l = a.length;
		
		for(int i =0 ; i < l-1; i++){
			for(int j=0; j< l-1-i;j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int x : a)
				System.out.print(x+  " ");
		
	}

}
