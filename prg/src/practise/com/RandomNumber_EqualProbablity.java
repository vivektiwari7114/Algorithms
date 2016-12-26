package practise.com;

import java.util.Random;

public class RandomNumber_EqualProbablity {
	public static void main(String args[]){
		
		int arr[] = {2,-4,5,-7,100};
		
		int len = arr.length;
		Random rm = new Random();
		
		for(int i = len; i >0; i--){
			int index = rm.nextInt(i);
			System.out.println(index);
			int temp = arr[index];
			arr[index] = arr[i-1];
			arr[i-1] = temp;
		}
		
		for(int k : arr)
				System.out.print(k + " ");
		
		
	}
	
	

}
