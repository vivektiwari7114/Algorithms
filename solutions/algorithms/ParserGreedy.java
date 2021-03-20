/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author VivekTiwari
 *
 */
public class ParserGreedy {
	private static Map<Integer,Integer> store= new HashMap<Integer, Integer>();
public static void main(String args[]){
		
		String fileName = "data.txt";
		Scanner inputFile = new Scanner(fileName);
		readGreedyFile(inputFile);
		store = sortByValue(store);
		System.out.println(store);
			
	
	}

public static void readGreedyFile ( Scanner inputFile){
	
	String pattern = "set";
	Pattern pat = Pattern.compile(pattern);
	try {
        File file = new File(inputFile.nextLine());
        inputFile = new Scanner(file);
        while (inputFile.hasNextLine() ) {
           String line = inputFile.nextLine();
           Pattern p = Pattern.compile("set\\(\\[(.*?)\\]\\)");
           Matcher m = p.matcher(line);

        	while(m.find()) {
        	   // System.out.println(m.group(1));
        		 String getNumbers[] = m.group(1).split(",");
        		 for(String res:getNumbers ){
        			 String num = res.trim();
        			 
        			 
        			if( !num.equals(" ")){
        				
        			 int curr = Integer.parseInt(num);
        			 if(store.containsKey(curr))
        				 	store.put(curr, store.get(curr) + 1 );
        			 else
        				 store.put(curr, 1 );
        			}
        		 }	
        	 }
        }
        
        inputFile.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
	List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
	Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
		@Override
		public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
			return (e1.getValue()).compareTo(e2.getValue());
		}
	});
 
	Map<K, V> result = new LinkedHashMap<>();
	for (Map.Entry<K, V> entry : list) {
		result.put(entry.getKey(), entry.getValue());
	}
 
	return result;
}

}
