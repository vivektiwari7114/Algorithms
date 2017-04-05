/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;
import java.io.File;
import java.util.Scanner;
import java.util.*;


/**
 * @author VivekTiwari
 *
 */
public class ParseHealerOutput {
	
	public static void main(String args[]){
		
		String fileName = "data.txt";
		Scanner inputFile = new Scanner(fileName);
		try {
	           
            File file = new File(inputFile.nextLine());
            inputFile = new Scanner(file);

         
            while (inputFile.hasNextLine() ) {
               String line = inputFile.nextLine();
               
               System.out.println(line);
             
            }
            inputFile.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}

}
