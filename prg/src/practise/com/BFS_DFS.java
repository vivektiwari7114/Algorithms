package practise.com;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


/* Name: Graph Implementation Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: BFS and DFS 
 */
public class BFS_DFS {
	public static void main(String args[]){
		Graph g1   = new Graph(6);
		int distance[] = new int[6];
		
		g1.addEdges(0,1); g1.addEdges(0,3);
		g1.addEdges(1,0); g1.addEdges(1,2);g1.addEdges(1,4); 
		g1.addEdges(2,5); g1.addEdges(2,1);
		g1.addEdges(3,0); g1.addEdges(3,4);
		g1.addEdges(4,1); g1.addEdges(4,5);g1.addEdges(4,3); 
		g1.addEdges(5,2); g1.addEdges(5,4);
		//System.out.println(g1.countDistance(0, 5));
		g1.DFS(0, distance);
		for(int a : distance)
				System.out.print(a);
		
		
		
		
	}

}
class Graph{
	private int numberOfNode;
	private ArrayList<Integer> edges[];
	public Graph(int n){
		this.numberOfNode = n;
		edges = new ArrayList[n];
		for(int i=0; i < numberOfNode;i++){
			edges[i] = new ArrayList<Integer>();
		}
	}
	public void addEdges(int from , int to){
		edges[from].add(to);
	}
	public void BFS(int source){
		boolean isVisited[] = new boolean[this.numberOfNode];
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		isVisited[source] = true;
		q1.add(source);
		
		while( !q1.isEmpty() ){
			
			int curr = q1.remove();
			System.out.println("Curent Node:"+ curr);
			ArrayList<Integer> adjacent = this.edges[curr];
			for(int i=0; i < adjacent.size(); i++){
				int currNode = adjacent.get(i);
				//System.out.println(" "+currNode);
				if( isVisited[currNode] != true ){
					System.out.println("Node Processed "+currNode);
					q1.add(currNode);
					isVisited[currNode] = true;
				}
			}
		}
	}
	public void DFS(int source, int distance[] ){
		boolean isVisited[] = new boolean[this.numberOfNode];
		
		Stack<Integer> q1 = new Stack<Integer>();
		
		isVisited[source] = true;
		q1.add(source);
		distance[source] = 0;
		while( !q1.isEmpty() ){
			
			int curr = q1.pop();
			
			System.out.println("Curent Node:"+ curr);
			ArrayList<Integer> adjacent = this.edges[curr];
			for(int i=0; i < adjacent.size(); i++){
				int currNode = adjacent.get(i);
				//System.out.println(" "+currNode);
				if( isVisited[currNode] != true ){
					//System.out.println("Node Processed "+currNode);
					q1.push(currNode);
					isVisited[currNode] = true;
					distance[currNode]= distance[curr] +1;
				}
			}
		}
	}
	public int countDistance(int source, int destination){
		boolean isVisited[] = new boolean[this.numberOfNode];
		int distance[] = new int[this.numberOfNode];
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		isVisited[source] = true;
		q1.add(source);
		distance[source] = 0;
		
		while( !q1.isEmpty() ){
		
			int curr = q1.remove();
			
			ArrayList<Integer> adjacent = this.edges[curr];
		
			for(int i=0; i < adjacent.size(); i++){
				int currNode = adjacent.get(i);
				//System.out.println("Current Node"+currNode);
				//System.out.println(" "+currNode);
					
				if( isVisited[currNode] != true ){
					
					//System.out.println("Node Processed "+currNode);
					q1.add(currNode);
					isVisited[currNode] = true;
					distance[currNode]= distance[curr] +1;
				}
			}
			
		}
		return distance[destination];
	}
}
