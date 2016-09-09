package practise.com;

public class rotateImage {
		public static void main(String args[]){
			//Out of place
			int n = 4;
			int image[][] = new int[n][n];
			int rotate[][] = new int[n][n];
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
			//Rotate The MAtrix by 90 Degree
			for(int i =0; i< n; i++){
				for(int j =0; j< n; j++){
					rotate[i][j] = image[n-1-j][i];
				}
			}
			System.out.println("");
			System.out.println("After Rotation");
			for(int i =0; i< n; i++){
				System.out.println("");
				for(int j =0; j< n; j++){
					System.out.print(rotate[i][j] + " ");
				}
			}
	}
}
