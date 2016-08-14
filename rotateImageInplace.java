package practise.com;

/* Name: RotateImage Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Rotate an image represented as 2D matrix in Place
 */
public class rotateImageInplace {
	public static void main(String args[]){
		int n = 6;
		int image[][] = new int[n][n];
		int count =0;
		for(int i =0; i<n; i++){
			for(int j =0; j< n; j++){
				image[i][j]= count;
				count++;
			}
		}
		//Print The Matrix
		for(int i =0; i< n; i++){
			System.out.println("");
			for(int j =0; j< n; j++){
				System.out.print(image[i][j] + " ");
			}
		}
		//In Place
		for(int layer = 0; layer < 2; layer++){
			int first = layer;
			int last = n-1-layer;
			for(int i =first; i< last; i++){
				int offset = i-first;
				int top = image[first][i];
				
				image[first][i] = image[last-offset][first];
				
				image[last-offset][first] = image[last][last-offset];
				
				image[last][last-offset] = image[ i][last];
				image[i][last] = top;
			}
		}
		System.out.println("");
		System.out.println("After Rotation");
		for(int i =0; i< n; i++){
			System.out.println("");
			for(int j =0; j< n; j++){
				System.out.print(image[i][j] + " ");
			}
		}
		
		
	}

}
