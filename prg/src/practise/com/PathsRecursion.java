package practise.com;

public class PathsRecursion {
	public static void  main(String args[]){
		int  m = 3, n=3;
		int square[][] = new int[m][n];
		//System.out.println(square[0][1]);
		System.out.println(getAllPaths(m-1,n-1,square));
	}
	public static int getAllPaths(int m, int n,int square[][]){
		if(m ==0 || n==0)
			return 1;
		else if(square[m-1][n-1] != 0)
			 return square[m][n];
		else{
			square[m-1][n-1] = getAllPaths(m, n-1,square) + getAllPaths(m-1, n,square) ;
			return square[m-1][n-1];
		}
	}

}
