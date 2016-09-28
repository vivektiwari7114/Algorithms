package practise.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class ReadAFile {
		public static void main(String args[]) {
			int k = 10;
			String input[] = new String[k];
			String fileName = "/Users/VivekTiwari/Desktop/NLP/temp.txt";
			String line = null;
			int total =0;
			try {
		            // FileReader reads text files in the default encoding.
					
		            FileReader fileReader =  new FileReader(fileName);
		           
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		           
		            while((line = bufferedReader.readLine()) != null) {
		            	int i = total % k;
		            	input[i] = line;
		            	total++;
		             }   

		            // Always close files.
		            bufferedReader.close();         
		        }
		       
			 catch(IOException ex) {
		           
		           ex.printStackTrace();
		        }
			int start = 0, count =0;
			if(total < k){
				start = 0;
				count = total;
			}else{
				start =  total % k;
				count = k;
			}
			
			for(int i=0; i < count; i++){
					int t = (start + i)% k;
					System.out.println(input[t]+" ");
			}
		}

}
