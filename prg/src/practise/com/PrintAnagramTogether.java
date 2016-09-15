package practise.com;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
		List<List<String>> fin = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<String>();
		int l = input.length;
		Anagram in[] = new Anagram[l];
		
		for(int i=0;i < l;i++)
			in[i] = new Anagram(i, input[i]);
		//Sorting the individual Strings
		for(int i=0; i< l; i++)
			sortIndividualWords(in[i]);
		//Sort the entire Words 
		sortTheArray(in);
		/*for(int i=0; i<l;i++)
			System.out.print(input[in[i].index] + " " );
		System.out.println("");*/
		
		String comp = in[0].str;
		temp.add(input[in[0].index]);
		System.out.println(comp);
				for(int i=1; i<l;i++){
				    if( comp.compareTo( in[i].str ) == 0 )
				        temp.add(input[in[i].index]);
				  else{
					 // System.out.println("hello");
				      fin.add(new ArrayList(temp));
				      temp.clear();
				      comp = in[i].str;
				     // System.out.println(comp);
				      temp.add(input[in[i].index]);
				  }
				}
				fin.add(temp);
				
				System.out.println(fin);
		
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
