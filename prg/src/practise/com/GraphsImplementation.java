package practise.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;


/* Name: Graph Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Implement a Directed graph
 */
public class GraphsImplementation {
	private int node; //Number of nodes
	private List<Integer> edges[]; 
	public GraphsImplementation(int n){
		this.node = n;
		edges = new ArrayList[n];
		for(int i =0; i < n; i++)
				edges[i] = new ArrayList<Integer>();
		
	}
	public void addEdges(int from, int to ){
		this.edges[from].add(to);
	}
	public void displayConnections(){
		for(int i=0; i< this.node; i++){
			List<Integer> temp = this.edges[i];
			
			System.out.println("Connection from node "+i+" are ");
			for(int k : temp)
					System.out.print(k+" ");
			System.out.println();
		}
	}
	public boolean isReachable(int source, int destination){
		boolean isVisited[] = new boolean[this.node];
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.add(source);
		isVisited[source] = true;
		while(!q1.isEmpty()){
			int curr = q1.poll();
			List<Integer> lt = edges[curr];
			for(int i=0; i< lt.size(); i++){
				if(lt.get(i) == destination)
					return true;
				if(!isVisited[lt.get(i)] ){
					q1.add(lt.get(i));
					isVisited[lt.get(i)] = true;
				}
			}
		}
		return false;
		
	}
	public static void main(String args[]){
		GraphsImplementation g1 = new GraphsImplementation(4);
		g1.addEdges(0,1);
		g1.addEdges(0,2);
		g1.addEdges(1,2);
		g1.addEdges(2,0);
		g1.addEdges(2,3);
		g1.addEdges(3,3);
		System.out.println(g1.isReachable(2, 1));
		
		//g1.displayConnections();
	}
}
