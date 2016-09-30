package practise.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryAndCatch {
	public static void main(String args[]){
	
	try {
		
        // FileReader reads text files in the default encoding.
		String fileName = "/Use/VivekTiwari/Desktop/NLP/temp.txt";
        FileReader fileReader =  new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.close();  
      
      
    }
    catch(IOException ex) {
    	 
    		ex.printStackTrace();
    		
    	}
	finally{
		System.out.println("I am exiting");
	}
	}

}
