package practise.com;

public class FindElementInRotatedSorted {
	public static void main(String args[]){
		int input[] = {3,4,5,1,2};
		int key = 4;
		binarySearch(input, key, 0, input.length -1);
	}
	public static void  binarySearch(int [] a, int key, int low, int high){
		
		if(low > high)
				return;
		int mid = low + (high - low)/2;
		if(a[mid] == key){
			System.out.println("Index is: "+mid);
			System.exit(0);
		}
		//Check whether the left half is sorted or not
		if(a[low] < a[mid]){
			if(key >= a[low] && key <= a[mid])
				binarySearch(a,key, low,mid-1);
			else
				binarySearch(a,key, mid+1,high);
			
		}else{ // Second half is sorted
			if(key >= a[mid] && key <= a[high])
				binarySearch(a, key, mid+1, high);
			else
				binarySearch(a,key, low, mid -1);
			
		}
		
	}
}
