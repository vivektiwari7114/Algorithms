package practise.com;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathFinder {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
    	
        String filename = "input_1.txt";
        if (args.length > 0) {
        	filename = args[0];
        }
     
        List<String> answer = parseFile(filename);
        //System.out.println(answer);
    }
    
    static List<String> parseFile(String filename)
    		throws FileNotFoundException, IOException {
    	/*
    	 *  Don't modify this function
    	 */
        BufferedReader input = new BufferedReader(new FileReader(filename));
        List<String> allLines = new ArrayList<String>();
        String line;
        while ((line = input.readLine()) != null) {
        	allLines.add(line);
        }
        input.close();

        return parseLines(allLines);    	
    }
    
    static List<String> parseLines(List<String> lines) {
    	int l = lines.size();
    	StringBuilder input = new StringBuilder();
    	String first_Input = lines.get(0);
    	char source =  first_Input.charAt(0);
    	char destination =  first_Input.charAt(2);
    	GraphsImplementation g1 = new GraphsImplementation(100);
    	List<String> result = new ArrayList<String>();
    	
    	for(int i=1 ; i< 2;i++ ){
    		String  temp = lines.get(i);
    		String[]  curr = temp.split(":");
    		char node1 = curr[0].charAt(0);
    		char [] restnode = curr[1].toCharArray();
    		for(char a : restnode)
    				if (a != ' ')
    					g1.addEdges(node1, a);
    		
    		g1.displayConnections();
    		
    			
    		
    	}
    			
 
    		
    	
    	return null;
    }
}

class GraphsImplementationClass {
	 char node; //Number of nodes
	 List<Character> edges[]; 
	public GraphsImplementationClass(char n){
		this.node = n;
		edges = new ArrayList[n];
		for(int i =0; i < n; i++)
				edges[i] = new ArrayList<Character>();
		
	}
	public void addEdges(char from, char to ){
		this.edges[from].add(to);
	}
	public void displayConnections(){
		for(int i=0; i< this.node; i++){
			List<Character> temp = this.edges[i];
			
			System.out.println("Connection from node "+i+" are ");
			for(int k : temp)
					System.out.print(k+" ");
			System.out.println();
		}
	}
	public boolean isReachable(char source, char destination){
		boolean isVisited[] = new boolean[this.node];
		Queue<Character> q1 = new LinkedList<Character>();
		
		
		q1.add(source);
		isVisited[source] = true;
		while(!q1.isEmpty()){
			int curr = q1.poll();
			List<Character> lt = edges[curr];
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
