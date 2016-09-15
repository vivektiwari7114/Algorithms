package practise.com;

import java.util.Arrays;

class Anagram{
	int index;
	String str;
	public Anagram(int index , String str){
		this.index = index;
		this.str = str;
	}
	public void setString(String st){
		this.str = st;
	}
}

public class PrintAnagramTogether {
	public static void main(String args[]){
		String input[] = {"cat", "dog", "tac", "god", "act"};
		int l = input.length;
		Anagram in[] = new Anagram[l];
		
		for(int i=0;i < l;i++)
			in[i] = new Anagram(i, input[i]);
		//Sorting the individual Strings
		for(int i=0; i< l; i++)
			sortIndividualWords(in[i]);
		
		//Sort the entire Words 
		sortTheArray(in);
			
		/*for(Anagram a: in)
			System.out.print(a.str + " " + a.index);*/
		
		for(int i=0; i<l;i++)
			System.out.print(input[in[i].index] + " " );
		
		
		
	
			
		
		
	}
	public static Anagram[] sortTheArray(Anagram[] in){
		for(int i=0; i< in.length; i++){
			for(int j=i+1; j < in.length; j++){
				if( in[i].str.compareTo(in[j].str) > 0){
					Anagram temp = in[i];
					in[i] = in[j];
					in[j] = temp;
					}
			}
		}
		return in;
	}
	public static Anagram sortIndividualWords(Anagram input){
		char in[] = input.str.toCharArray();
		Arrays.sort(in);
		input.setString(String.valueOf(in));
		return input;
		
	}
	
}
