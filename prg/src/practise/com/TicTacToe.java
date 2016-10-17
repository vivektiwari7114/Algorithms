package practise.com;


/* Name: Tic Tac Toe
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement Tic Tack toe
 */
public class TicTacToe {
	public static void main(String args[]){
		Pieces p = new Pieces(3);
		 p.moves(0, 0, State.O) ;
		 p.moves(0, 1, State.X) ;
		 p.moves(0, 2, State.O) ;
		 
		 p.moves(1, 0, State.X) ;
		 p.moves(1, 1, State.O) ;
		 p.moves(1, 2, State.X) ;
		 
		 p.moves(2, 0, State.O) ;
		 p.moves(2, 1, State.X) ;
		 p.moves(2, 2, State.X) ;
		
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
	 public void moves(int x, int y , State s){
		
		 
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
			 if(i == n-1){
				 System.out.println("Player "+s+" Wins");
			 	System.exit(0);
			 }
		 }
		 
		 //check column
		 for(int i=0; i < n; i++){
			 if(board[i][y] != s )
				 break;
			 if(i == n-1){
				 System.out.println("Player "+s+" Wins");
			 	System.exit(0);
			 }
				
		 }
		 
		 //Check Diagnol
		 for(int i=0; i < n ; i++){
			 if(board[i][i] != s )
				 break;
			 if(i == n-1){
				 System.out.println("Player "+s+" Wins");
			 	System.exit(0);
			 }
		 }
		 
		//Check Anti Diagnol
		 for(int i=0; i < n ; i++){
			 if(board[i][n-1-i] != s )
				 break;
			 if(i == n-1){
				 System.out.println("Player "+s+" Wins");
			 	System.exit(0);
			 }
		 }
		 
		 if( moveCount == Math.round( Math.pow(3, n)) ){
			 System.out.println("DRAW");
		 	System.exit(0);
		 }
			 	
		 
		
		 
		 
		 
	 }
	
	
}