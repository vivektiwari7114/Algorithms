/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import java.util.*;


/**
 * @author VivekTiwari
 *
 */
public class ParseHealerOutput {
	private static Map<Integer,Integer> store= new HashMap<Integer, Integer>();
	
	public static void main(String args[]){
		
		String fileName = "data.txt";
		Scanner inputFile = new Scanner(fileName);
		readHealerFile(inputFile);
		

		
		
	}
	public static void readHealerFile ( Scanner inputFile){
		
		String pattern = "Action in time step";
		Pattern pat = Pattern.compile(pattern);
		try {
            File file = new File(inputFile.nextLine());
            inputFile = new Scanner(file);
            while (inputFile.hasNextLine() ) {
               String line = inputFile.nextLine();
               Matcher match = pat.matcher(line);
               if(match.find()){
            	   storeInMap(line);	
               }
            }
            inputFile.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	public static void storeInMap(String line){
	 String getNumbers[] = line.split(":")[1].split(" ");
	 for(String num:getNumbers ){
		 int curr = Integer.parseInt(num);
		 if(store.containsKey(curr))
			 	store.put(curr, store.get(curr) + 1 );
		 else
			 store.put(curr, 1 );
			 
	}
		 	
	
		
	}

}
