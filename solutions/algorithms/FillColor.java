package practise.com;

public class FillColor{
    public static void main(String args[]){
    int screen[][] = {
			{1,3,2},
			{1,2,3},
			{3,2,2},
			
			
	};
    int fillColor = 4;
    int borderColor = 3;
    int x = 1;
    int y = 1;
    for(int i=0; i< screen.length; i++){
    	for(int j=0; j< screen[0].length; j++){
    		System.out.print(screen[i][j] + " ");
    	}
    	System.out.println();
    }
    getFlledMatrix(screen, fillColor,borderColor, x, y);
    System.out.println();
    for(int i=0; i< screen.length; i++){
    	for(int j=0; j< screen[0].length; j++){
    		System.out.print(screen[i][j] + " ");
    	}
    	System.out.println();
    }
    
  }
    public static void  getFlledMatrix(int [][] screen, int fillcolor, int borderColor, int x , int y ){
    	 System.out.println("X "+x + " Y "+ y);
    if( x < 0 ||  x >= screen.length || y < 0 || y >= screen[0].length)
            return;
    int currentColor = screen[x][y];
   
    if(currentColor != borderColor &&  currentColor != fillcolor){
        screen[x][y] = fillcolor;
        getFlledMatrix(screen, fillcolor,borderColor, x+1, y );
        getFlledMatrix(screen, fillcolor,borderColor, x-1, y );
        getFlledMatrix(screen, fillcolor,borderColor, x, y+1 );
        getFlledMatrix(screen, fillcolor,borderColor, x, y-1 );
    
    	}
    }
  
}
