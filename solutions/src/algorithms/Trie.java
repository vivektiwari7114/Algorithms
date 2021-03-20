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
	public boolean check(String word){
		return searchRecur(root, 0, word);
	}
	
	public boolean searchRecur (TrieNode root, int step, String word){
		
		if(step  == word.length()){
			return root.end == true;
		}
		char ch = word.charAt(step);
		if(ch != '.'){
			if(root.children.get(ch) != null){
				return searchRecur(root.children.get(ch), step + 1, word);
			}
		}else{
			for(Map.Entry<Character, TrieNode> mp : root.children.entrySet()){
				boolean status = searchRecur(mp.getValue(), step+1, word);
				//System.out.println(status);
				return status;
				
			}
			
		}
			
			return false;
		
		
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
		curr.insert("bad");
		curr.insert("dad");
		curr.insert("mad");
		System.out.println("bad " + curr.check("..d"));
		
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
