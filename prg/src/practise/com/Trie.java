package practise.com;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	private TrieNode root;
	public Trie(){
		root = new TrieNode();
	}
	
	public void insert(String item){
		TrieNode curr = root;
		for(int i=0; i < item.length(); i++){
			char ch = item.charAt(i);
			TrieNode node = curr.children.get(ch);
			if( node == null ){
				node = new TrieNode();
				curr.children.put(ch, node);
			}
			curr = node;
		}
		curr.end = true;
	}
	
	public boolean search (String word){
		TrieNode curr = root;
		
		for (int i=0; i < word.length(); i++){
			char ch = word.charAt(i);
			TrieNode node = curr.children.get(ch);
			if(node == null)
				return false;
			curr = node;
		}
		return curr.end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trie curr = new Trie();
		curr.insert("vivek");
		curr.insert("viv");
		System.out.println("vivek " + curr.search("vivek"));
		System.out.println("vivf " + curr.search("vivf"));
		System.out.println("viv " + curr.search("viv"));
		System.out.println("abc " + curr.search("abc"));

	}

}

class TrieNode{
	Map<Character, TrieNode> children;
	boolean end;
	public TrieNode(){
		this.children = new HashMap<Character, TrieNode>();
		end = false;
		
	}
}
