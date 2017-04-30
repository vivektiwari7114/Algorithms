package practise.com;

import java.io.*;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class makeBigTxt {
	public static void main(String args[]) throws IOException{
		// Getting all the ABC news HTML files
		File currFolder = new File("/Users/VivekTiwari/Downloads/ABCNewsData/ABCNewsDownloadData");
		//Regular expression for matching snippets
		String regex = "[a-zA-Z]*[.]?";
		// Specify the location of the new file to be written with name big.txt
		Writer fw = new FileWriter("/Users/VivekTiwari/Downloads/big.txt");
		
		
		for(File fileName : currFolder.listFiles()){
			Document docs = Jsoup.parse(fileName, "UTF-8");
			String getText = docs.body().text();
			String[] words = getText.split(" ");
			// iTeration over word in the file
			for(String word : words){
				System.out.println(word);
				if(word.matches(regex)){
					if(words[words.length-1].length()==0)
						continue;
					if(word.charAt(word.length()-1) == '.')
						word = word.replaceAll("[.]", "");
					
					fw.write(word+" ");
				
				}
			}
		}
		fw.close();
	}
	
}