package practise.com;

/* Class Name : Selection Sort
 * Parameters: NA
 * Return :Sorted Array In Increasing Order
 * Function: Sort Array in increasing order using Selection SOrt
 */
public class SelectionSort {
	public static void main(String args[]){
		int a[] = {10,9,12,7,6,5,4,12,2,1};
		int n = a.length;
		int j =0, i =0, minVal =0, min =0;
		boolean flag = false;
		
		for(i=0; i<n; i++){
			flag = false;
			minVal = a[i];
			for(j = i+1; j < n; j++){
				if(a[j] < minVal){
					min = j;
					minVal = a[j];
					flag = true;
					}
			}
			if(flag){
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			}
		}
		for(int t: a)
			System.out.print(t+" ");
	}
}
