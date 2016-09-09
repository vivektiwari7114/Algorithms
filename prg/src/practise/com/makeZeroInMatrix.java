package practise.com;

import java.util.ArrayList;
import java.util.List;

public class makeZeroInMatrix {
	
	/* Name: Make Row and Column Zero
	 * Parameters: Not Applicable
	 * Return :Void
	 * Function: Given N*N matrix, make entire row and column elements zero if any element is zero 
	 */
	public static void main(String args[]){
		int a[][] = new int [4][3];
		a[0][0] = 0;a[0][1] = 1;a[0][2] = 1;
		a[1][0] = 1;a[1][1] = 1;a[1][2] = 1;
		a[2][0] = 1;a[2][1] = 0;a[2][2] = 1;
		a[3][0] = 1;a[3][1] = 1;a[3][2] = 1;
		int row[] = new int[a.length];
		int column[] = new int [a[0].length];
		
		//Original Matrices
		System.out.println("Before Replacemet");
		for(int i =0; i< a.length; i++){
			for(int j =0; j< a[i].length; j++){
				if(a[i][j] == 0){
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		//Main Logic
		for(int i=0; i< a.length;i++){
			for(int j=0; j< a[i].length; j++){
				if(row[i] == 1|| column[j] == 1)
					a[i][j] = 0;
				}
			}
		
		//To check Final Results
		System.out.println("");
		System.out.println("After Replacemet");
		for(int i =0; i< a.length; i++){
			System.out.println("");
			for(int j =0; j< a[i].length; j++){
				System.out.print(a[i][j] + " ");
			}
		}
		
	}
}
