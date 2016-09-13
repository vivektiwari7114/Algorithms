package practise.com;

/* Class Name : Merge Sort
 * Parameters: NA
 * Return :Sorted Array In increasing Order
 * Function: Sort Array in increasing order using merge Sort
 */
public class MergeSort {
	
	
	public static void main(String args[]){
		int a[] = {1,10,4,32,61,11,23,100};
		int low = 0;
		int high = a.length - 1;
		int temp[] = new int [a.length];
		
		MergeSort m = new MergeSort();
		m.mergeSort(a, temp, low, high);
		for(int t: temp)
			System.out.print(t + " ");
			
	}
	public  void mergeSort(int a[], int temp[], int low, int high){
		if(low == high)
			return;
		int mid = low +(high -low)/2;
		mergeSort(a, temp,  low, mid);
		mergeSort(a, temp, mid+1, high);
		merge(a, temp, low,mid+1, high);
	}
	public  void merge(int a[], int temp[], int low, int center, int high){
		
		int left = low;
		int i = low;
		int leftEnd = center -1;
		int right = center;
		int rightEnd = high;
		while(left <= leftEnd && right <= rightEnd){
			if(a[left] < a[right])
				temp[i++] = a[left++];
			else
				temp[i++] = a[right++];
			}
		
		while(left <= leftEnd)
			temp[i++] = a[left++];
		while(right <= rightEnd)
			temp[i++] = a[right++];
		//Transfer to the Array a
		for(int k= low; k <= high;k++)
			a[k] = temp[k];
			
		
	}

}
