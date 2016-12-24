package practise.com;

public class TicTacToeEfficient {
	public static void main(String args[]){
		TicTacEfficient gB = new TicTacEfficient(3);
		
		
		
		
	
		gB.move(0, 0, 1);
		gB.move(0, 2, 2);
		gB.move(1, 1, 1);
		gB.move(1, 2, 2);
		gB.move(2, 2, 1);
		gB.move(2, 0, 1);
		gB.move(2, 2, 1);
		gB.move(0, 0, 1);
		gB.move(0, 2, 2);
		
		
		
		
		
	}

}

class TicTacEfficient {
	private int board[][];
	private int row[];
	private int col[];
	private int diag = 0;
	private int antiDiag = 0;
	private int moves = 0;
	private int n;
	public TicTacEfficient(int n){
		this.n = n;
		row = new int [n];
		col = new int[n];
		this.board = new int [n][n];
		for(int i=0; i < n; i++){
			for(int j=0; j < n; j++){
				board[i][j] = 0;   // 0 represent the blank state
			}
		}	
	}
	public void move(int x, int y, int state){
		// 1 Represent X and 2 represent O
		++moves;
		int curr = (state == 1? 1: -1);
		
		//System.out.println(curr);
		row[x] += curr;
		col[y] += curr;
		
		if(x == y)
			diag += curr;
		
		if(x == (n-1) - y )
			antiDiag += curr;
		
		for(int i=0; i < n ; i++){
			if(row[i] == n){
				System.out.println("Player Wins" + state);
				System.exit(0);
			}
			if(col[i] == n){
				System.out.println("Player Wins" + state);
				System.exit(0);
			}
		}
		
		if(diag == 3){
			System.out.println("Player Wins" + state);
			System.exit(0);
			
		}
		
		if(antiDiag == 3){
			System.out.println("Player Wins" + state);
			System.exit(0);
			
		}
		if(moves == Math.pow(n, n)){
			System.out.println("Shit Draw");
			System.exit(0);
		}
		
		
		
	}
}