package practise.com;

/* Name: Tic Tac Toe
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement Tic Tac Toe using adversial Technique to decrease memory requirements
 */

public class EfficientTicTacToe {
	public static void main(String args[]){
		TicTac t1 = new TicTac(3);
		System.out.println(t1.makeMoves(0, 2, 2));
		System.out.println(t1.makeMoves(1, 1, 2));
		System.out.println(t1.makeMoves(2, 0, 2));
	}

}

class TicTac{
	int row [];
	int column[];
	int diagnol=0;
	int antiDiagnol =0;
	int n;
	public TicTac(int n){
		this.n = n;
		row = new int[n];
		column = new int[n];
	}
	/* Name: Tic Tac Toe
	 * Parameters: Not Applicable
	 * Return :Not Applicable
	 * Function: Implement Efficient version of Tic Tac Toe using less memory space
	 */
	public int makeMoves(int rows, int cols, int player){
		int val = player == 1?1:-1;
		row[rows] += val;
		column[cols] += val;
		
		if(rows == cols)
			diagnol += val;
		if(rows + cols == n-1)
			antiDiagnol += val;
		
		if(Math.abs(row[rows]) == n || Math.abs(column[cols]) == n || Math.abs(diagnol) == n || Math.abs(antiDiagnol) == n)
			return player;
		
		return 0;
		
	}
}
