package practise.com;

public class QuickSort {
	public static void main(String args[]){
		int arr[] = { 9, 2, 4, 7, 3, 10};
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
		//int pIndex = high;
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
		
		mergeSort(arr,low,left-1);
		mergeSort(arr,left+1,high);
		
			
			
	
		
	}

}
