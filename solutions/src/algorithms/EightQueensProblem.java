package practise.com;

/* Name: N Queen Problem
 * Parameters: NA
 * Return :Number of paths 
 * Function: Find out the position to arrange N queens in N*N Board Matrix
 */
public class EightQueensProblem {
	
	public static void main(String args[]){
		int n = 4;
		Position positions[] = new Position[n];
		int row = 0;
		boolean flag = getThePositionOfTheQueens(positions, row, n);
		if(flag){
			for(Position t : positions)
				System.out.println(t.x +"-"+t.y);
		}
		
		
		
	}
	public static  boolean getThePositionOfTheQueens(Position positions[], int row, int n){
		//System.out.println("Hello");
		if(n == row)
			return true;
		
		int col;
		for(col =0; col < n; col++){
			boolean isSafe = true;
			for(int pS = 0; pS < row;pS++ ){
				if( positions[pS].y == col || ((positions[pS].x - positions[pS].y) == row - col ) || 
						((positions[pS].x + positions[pS].y) == row + col ) ){
					isSafe = false;
					break;
				}
			}
			if(isSafe){
				positions[row] = new Position(row, col);
				if (getThePositionOfTheQueens(positions,row + 1,  n))
					return true;
		}

		
	}
		return false;

}
}




class Position{
	public int x ;
	public int y ;
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
}
