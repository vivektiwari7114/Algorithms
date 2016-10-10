package practise.com;


/* Name: Graph Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement Dijktras Algorithm
 */
public class ShortestPath {
	int n;
	public ShortestPath(int n){
		this.n = n;
	}
	
	public static void main(String args[]){
		int n = 5;
		int graphM[][]= {{0,2,0,0,8},
						{2,0,9,0,3},
						{0,9,0,0,1},
						{0,0,0,0,0},
						{8,3,1,0,0},
						};
		ShortestPath sp = new ShortestPath(5);
		sp.Dijktras(graphM, 0);

		
		
	}
	public int findMinDistance(int dist[], boolean status[]){
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i=0; i< dist.length; i++){
			if( dist[i] < min && status[i] == false ){
				min = dist[i];
				index =i;
			}
		}
		return index;
	}
	public void Dijktras(int graph[][], int source){
		int dist[] = new int[n];
		boolean status[] = new boolean[n];
		
		for(int i=0; i < n ; i++){
			dist[i] = Integer.MAX_VALUE;
			status[i] = false;
		}
		dist[source] = 0;
			for(int i=0; i< n; i++){
					int u = findMinDistance(dist, status);
					//To check that the given node is not connetced to anynode 
					if(u != -1){    
					status[u] = true;
					for(int v = 0; v < n; v++){
						if(graph[u][v] !=0 && status[v] != true && graph[u][v] + dist[u] < dist[v])
							dist[v] = graph[u][v] + dist[u];
						}
					}
					
		}
			
			for(int a: dist)
			System.out.print(a + " ");
		
		
		
	}

}
