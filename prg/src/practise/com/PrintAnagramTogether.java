package practise.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
		List<String> tp = new ArrayList<String>();
		List<List<String>> result = new ArrayList<List<String>>();
		int l = input.length;
		Anagram in[] = new Anagram[l];
		
		for(int i=0;i < l;i++)
			in[i] = new Anagram(i, input[i]);
		//Sorting the individual Strings
		for(int i=0; i< l; i++)
			sortIndividualWords(in[i]);
		//Sort the entire Words 
		sortTheArray(in,input,tp,result);
		/*for(int i=0; i<l;i++)
			System.out.print(input[in[i].index] + " " );
		System.out.println("");*/
		
		/*String comp = in[0].str;
		temp.add(input[in[0].index]);
		System.out.println(comp);
				for(int i=1; i<l;i++){
				    if( comp.compareTo( in[i].str ) == 0 )
				        temp.add(input[in[i].index]);
				  else{
				      fin.add(new ArrayList(temp));
				      temp.clear();
				      comp = in[i].str;
				      temp.add(input[in[i].index]);
				  }
				}
				fin.add(temp);
				
				System.out.println(fin);*/
		//System.out.println(result);
		
}
	public static void sortTheArray(Anagram[] in, String input[], List<String> tp, List<List<String>> result){
		Set<String> store  = new HashSet<String>();
		
		for(int i =0; i < in.length; i++){
			String comp = in[i].str;
			if(store.contains(comp))
				continue;
			else
				store.add(comp);
			tp.add(input[in[i].index]);
			for(int j=i+1; j< in.length;j++){
				if( comp.compareTo(in[j].str)== 0  ){
					tp.add(input[in[j].index]);
				}
			}
			result.add(new ArrayList(tp));
			System.out.println("Intermediate Result"+result);
			tp.clear();
		}
		
		
	}
	public static Anagram sortIndividualWords(Anagram input){
		char in[] = input.str.toCharArray();
		Arrays.sort(in);
		input.setString(String.valueOf(in));
		return input;
		
	}
	
}
