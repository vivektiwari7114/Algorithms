package practise.com;


/* Name: Flood Fill
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Flood Fill algorithm
 */
public class FloodFillAlgo {
	public static void main(String args[]){
		int m = 8;
		int n = 8;
		int screen[][] = {
				 {1, 1, 1, 1, 1, 1, 1, 1},
                 {1, 1, 1, 1, 1, 1, 0, 0},
                 {1, 0, 0, 1, 1, 0, 1, 1},
                 {1, 2, 2, 2, 2, 0, 1, 0},
                 {1, 1, 1, 2, 2, 0, 1, 0},
                 {1, 1, 1, 2, 2, 2, 2, 0},
                 {1, 1, 1, 1, 1, 2, 1, 1},
                 {1, 1, 1, 1, 1, 2, 2, 1},
                };
		/*int screen[][] = {
				{1,1,3},
				{1,2,2},
				{1,2,3},
				
				
		};
		//Number of rows
		int m = 3;
		//Number of columns
		int n =3;*/
		
		int targetC = 2;
		int newColor = 3;
		int x = 3;
		int y = 3;
		if(targetC == newColor ){
			System.out.println("Both colors are same");
			return;
		}
		if(screen[y][x] != targetC){
		System.out.println("Color of given point is not same as target color");
			return;
		}
		//System.out.println(x + " "+y);
		floodFillHelper(x, y, screen, targetC, newColor,m,n);
		
		for(int i=0; i< m; i++){
			System.out.println();
			for(int j=0; j< n;j++){
				System.out.print(screen[i][j]+" ");
			}
		}
	
	}
	public static  void floodFillHelper(int x, int y, int screen[][], int targetC, int newColor, int m , int n){
		System.out.println("X "+x+" Y "+y+ " m "+m+"  "+n);
		if(x < 0 || x >=n || y < 0 || y >=m)
				return;
		if(screen[y][x] != targetC)
				return;
			screen[y][x] = newColor;
		//System.out.println("Val "+screen[x][y]);
		floodFillHelper(x+1, y,screen, targetC, newColor, m, n);
		floodFillHelper(x-1, y,screen, targetC, newColor, m, n);
		floodFillHelper(x, y+1,screen, targetC, newColor, m, n);
		floodFillHelper(x, y-1,screen, targetC, newColor, m, n);
		
		
	
	}
	

	
}
