package practise.com;

/* Matrix Multiplication Brute Force
 * Parameters: NA
 * Return :NA
 * Function:Matrix Multiplication Brute force
 */
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{2,3},{1,4}};
		int B[][] = {{1,2,6,},{4,5,8}};
		
		int rowA = A.length;
		int colB = B[0].length;
		int colA = A[0].length;
		
		int data[][] = new int[rowA][colB];
		
		for(int i=0; i < rowA; i++){
			for(int j=0; j<colB;j++){
						data[i][j] = 0;
						for(int k=0; k< colA;k++)
								data[i][j] = data[i][j] + A[i][k] * B[k][j]; 
				 }
			
		}
		for(int i=0; i < rowA; i++){
			for(int j=0; j<colB;j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}

}
