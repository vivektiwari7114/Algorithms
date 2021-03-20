package practise.com;

public class MergeSortedArray {
	public static void main(String args[]){
		int a[] = new int[8];
		int b[] = new int[4];
		a[0] = 8; a[1] = 6;	a[2] = 4; a[3] = 1;
		b[0] = 15; b[1] = 3;	b[2] = 2; b[3] = 0;
		
		mergeSortedArray(a, b, 4, 4);
	}
 public static void  mergeSortedArray(int a[], int b[], int m , int n){
	 
	int k = m+n-1;
	 int i = m-1;
	 int j = n-1;
	 //int va , vb =0;
	 while(i >=0 && j >= 0){
		 if(a[i] < b[j]){
			 a[k] = a[i];
			 i--;
		 }else{
			 a[k] = b[j];
			 j--;
		 }
		 k--;
	 }
	 while(j >=0){
		 a[k] = b[j];
		 j--;
		 k--;
	 }
	
	 
	 for(int t : a)
		 	System.out.print(t+" ");
 }
}
