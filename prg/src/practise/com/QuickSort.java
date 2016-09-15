package practise.com;

/* Class Name: Quick Sort
 * Parameters: NA
 * Return :Sorted Array Usig Quick Sort ALgorithm
 * Function: Sorted Array
 */
public class QuickSort {
	public static void main(String args[]){
		int arr[] = { 4,3,2,1};
		int low = 0;
		int high = arr.length - 1;
		
		mergeSort(arr,low,high);
		for(int t: arr)
				System.out.print(t +" ");
	}
	public static void mergeSort(int arr[], int low , int high){
		
		
		
		if(arr == null || arr.length == 0 )
				return;
		if(low >= high)
			return;
		int left = low;
		int right = high;
		int pivot = arr[high];
		while(left < right){
			if(arr[left] > pivot && arr[right] < pivot){
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left]  = temp;
				left++;
				right--;
			}
			else if(arr[left] < pivot)
				left++;
			else
				right--;
		}
		int t = arr[left];
		arr[left] = arr[high];
		arr[high] = t;
		
		System.out.println("Value of Low and High is: "+low +" "+high);
		System.out.println("");
		for(int t1: arr)
			System.out.print(t1 +" ");
		
		mergeSort(arr,low,left-1);
		mergeSort(arr,left+1,high);
		
	}

}
