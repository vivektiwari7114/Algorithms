package practise.com;

public class InsertionSort {
	public static void main(String args[]){
		int arr[] = {5,8,1,3,9,6,100,12,300};
		int l = arr.length;
		for(int i =0; i< l; i++ ){
			for(int j = i ; j >0 ; j--){
				if( arr[j] < arr[j-1] ){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int t : arr)
				System.out.print(t+" ");
	}

}
