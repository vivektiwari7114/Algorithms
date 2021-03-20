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
	private static Map<Integer,Integer> mapper= new HashMap<Integer, Integer>();
	public ParseHealerOutput(){
		
		
	}
	
	public static void main(String args[]){
		
		String fileName = "data.txt";
		Scanner inputFile = new Scanner(fileName);
		readHealerFile(inputFile);
		store = sortByValue(store);
		System.out.println(store);

		
		
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
	 String getNumbers[] = line.split(":")[1].trim().split(" ");
	 for(String num:getNumbers ){
		if( !num.equals(" ")){
			//System.out.println("Get: "+num);
		 int curr = Integer.parseInt(num);
		 if(store.containsKey(curr))
			 	store.put(curr, store.get(curr) + 1 );
		 else
			 store.put(curr, 1 );
		}
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
