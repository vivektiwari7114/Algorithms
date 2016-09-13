package practise.com;

/* Class Name : Merge Sort
 * Parameters: NA
 * Return :Sorted Array In increasing Order
 * Function: Sort Array in increasing order using merge Sort
 */
public class MergeSort {
	int  temp[] = new int[4];
	
	public static void main(String args[]){
		int a[] = {10,9,8,7};
		int low = 0;
		int high = a.length - 1;
		MergeSort m = new MergeSort();
		m.mergeSort(a,low,high);
		for(int t: m.temp)
			System.out.print(t + " ");
			
	}
	public  void mergeSort(int a[], int low, int high){
		
		if(low == high)
			return;
		int mid = low +(high -low)/2;
		
		mergeSort(a, low, mid);
		mergeSort(a, mid+1, high);
		merge(a, low,mid+1, high);
		
	}
	public  void merge(int a[], int low, int center, int high){
		
		int left = low;
		int i = low;
		int leftEnd = center -1;
		int right = center;
		int rightEnd = high;
		while(left <= leftEnd && right <= rightEnd){
			if(a[left] < a[right]){
				temp[i++] = a[left];
				left++;
			}else{
				temp[i++] = a[right];
				right++;
			}
			
		}
		while(left <= leftEnd){
			temp[i++] = a[left];
			left++;
			
		}
		while(right <= rightEnd){
			temp[i++] = a[right];
			right++;
		}
		for(int k= low; k <= high;k++)
			a[k] = temp[k];
			
		
	}

}
