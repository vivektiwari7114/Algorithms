package practise.com;

import java.util.Arrays;

public class SortStringInLex {
	public static void main(String args[]){
		String in[] = {"vivek","apple","vivez","boy"};
		/*Arrays.sort(in);
		for(String str : in)
				System.out.println(str);*/
		int l = in.length;
		for(int i=0; i < l-1;i++){
			for(int j=0; j< l-1; j++){
				if( in[j].compareTo(in[j+1])> 0 ){
					String temp = in[j];
					in[j] = in[j+1];
					in[j+1] = temp;
				}
			}
		}
		for(String str : in)
				System.out.println(str);
		
		
	}

}
