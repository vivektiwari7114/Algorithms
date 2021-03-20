package practise.com;

class Solution {
    public static void main(String args[]){
    	int A[] ={3, 8, 9, 7, 6};
    	int K =3;
        // write your code in Java SE 8
        
        int l = A.length;
        if(K >= l)
            K = K % l;
        
        reverse(A, 0, l-1);
        reverse(A,0,K-1);
        reverse(A,K,l-1);
        
       for(int a: A)
    	   	System.out.print(a+" ");
        
    }
    public static void reverse(int a[], int start, int end){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = a[start];
            start++;
            end--;
        }
    }
}