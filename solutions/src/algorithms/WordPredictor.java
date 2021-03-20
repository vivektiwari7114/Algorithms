package practise.com;
import java.io.File;
import java.util.Scanner;
import java.util.*;


/**
 * @author VivekTiwari
 *
 */
public class WordPredictor {
	/* Instance variable:
	 * countBigram: HashMap that store the occurrence of next word given current word
	 * fileName: Name of the file to be processed
	 */
	private  Map<String, Map<String , Integer>> countBigram = new HashMap<String, Map<String, Integer>>();
    private  String fileName;
    public WordPredictor(String fileName){
    	this.fileName = fileName;
    }
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        List<String>  store = new ArrayList<String>();
        Scanner inputFile = new Scanner(fileName);
        
		
		store = getAllTokens(inputFile, store);
		bigramMatrixImplementation(store);
		//System.out.println(countBigram);
		
		System.out.println( getMostLikelySuccessor("at"));

	}*/
    
    
    /* Function: getAllTokens
     * This function takes two input  1.Name of the file  2. Tokens stored as an ArrayList
     * Here I have Used ArrayList to minimize the file input read.write operations
     * This function parse file and return List of tokens in order
	 */
	public   List<String> getAllTokens(Scanner inputFile, List<String> store){
		try {
           
            File file = new File(inputFile.nextLine());
            inputFile = new Scanner(file);

         
            while (inputFile.hasNext()) {
                String word = inputFile.next();
              store.add(word);
            }
            inputFile.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		return  store;
		
	}
	
	 /* Function: bigramMatrixImplementation
     * This function takes one  input  1.List of words in order
     * This function count the occurrence of i+1th  word given ith words and store in Hash Map
	 */
	public   void bigramMatrixImplementation(List<String> store){
		
		
		for(int i=0; i < store.size() - 1; i++){
			if(!countBigram.containsKey(store.get(i)) ){
				
				Map<String , Integer> innerMap = new HashMap<String, Integer>();
				innerMap.put(store.get(i + 1), 1);
				countBigram.put(store.get(i), innerMap);
			}else{
				Map<String , Integer> innerMap = countBigram.get(store.get(i));
				if(!innerMap.containsKey(store.get(i+1))){
					innerMap.put(store.get(i+1), 1);
				}else{
					innerMap.put(store.get(i+1), innerMap.get(store.get(i+1)) + 1);
				}
				
			}
		}
		
	}
	
	 /* Function: getMostLikelySuccessor
     * This function takes one  input  1.Word who's successor has to be find out
     * This function predicts the next word and return it.
	 */
	
	public  String getMostLikelySuccessor(String currWord){
		
		List<String>  store = new ArrayList<String>();
		Scanner inputFile = new Scanner(fileName);
		store = getAllTokens(inputFile, store);
		bigramMatrixImplementation(store);	
		if(!countBigram.containsKey(currWord))
				return "Word Is not in the Corpus";
		
		Map<String, Integer> innerMap = countBigram.get(currWord);
		String result = Collections.max(innerMap.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
		return result;
	}
	
	

}
