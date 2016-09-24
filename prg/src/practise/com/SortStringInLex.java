package practise.com;

import java.util.Arrays;

public class SortStringInLex {
	public static void main(String args[]){
		String in[] = {"vivek","apple","zebra","boy"};
		Arrays.sort(in);
		for(String str : in)
				System.out.println(str);
	}

}
