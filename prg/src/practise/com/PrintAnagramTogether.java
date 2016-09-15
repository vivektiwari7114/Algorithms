package practise.com;

import java.util.Arrays;

public class PrintAnagramTogether {
	public static void main(String args[]){
		String input[] = {"cat", "dog", "tac", "god", "act"};
		int l = input.length;
		
		int index[] = new int[l];
		String word[] = new String[l];
		
		for(int i =0 ; i < l; i++){
			index[i] = i;
			input[i] = sortIndividualWords(input[i]);
		}
		
		for(int i=0; i< l;i++)
			System.out.println(input[i]);
		
		
	
			
		
		
	}
	public static String sortIndividualWords(String input){
		char in[] = input.toCharArray();
		Arrays.sort(in);
		return new String(in);
	}
}
