package practise.com;

public class TicTacToe {
	public static void main(String args[]){
		Pieces p = new Pieces(3);
		System.out.println( p.moves(0, 2, State.O) );
		System.out.println( p.moves(1, 1, State.O) );
		System.out.println( p.moves(2, 0, State.O) );
		
	}
	 
	

}

enum State {BLANK, X, O};
class Pieces {
	
	 State board[][];
	 int n ;
	 int moveCount=0;
	 public Pieces(int n){
		 this.n = n;
		 this.board = new State[n][n];
		 for(int i=0; i < n ; i++){
			 for(int j=0; j < n ;j++){
				 board[i][j] = State.BLANK;
			 }
		 }
		 
	 }
	 public boolean moves(int x, int y , State s){
		
		 
		 moveCount++;
		 
		 if(board[x][y] == State.BLANK)
			 board[x][y] = s;
		 
		/* for(int i=0; i < n; i++){
			 System.out.println();;
			 for(int j=0; j< n;j++){
				 System.out.print(board[i][j] + " ");
			 }
		 }*/
		 
		 //Check row
		 for(int i=0; i < n; i++){
			 if(board[x][i] != s )
				 break;
			 if(i == n-1)
				 return true;
		 }
		 
		 //check column
		 for(int i=0; i < n; i++){
			 if(board[i][y] != s )
				 break;
			 if(i == n-1)
				 return true;
		 }
		 
		 //Check Diagnol
		 for(int i=0; i < n ; i++){
			 if(board[i][i] != s )
				 break;
			 if(i == n-1)
				 return true;
		 }
		 
		//Check Anti Diagnol
		 for(int i=0; i < n ; i++){
			 if(board[i][n-1-i] != s )
				 break;
			 if(i == n-1)
				 return true;
		 }
		 
		 if( moveCount == Math.round( Math.pow(3, n)) )
			 	return false;
		 
		 return false;
		 
		 
		 
	 }
	
	
}