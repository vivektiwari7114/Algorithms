package snappractise;

public class findingAnagram{
	public static void main(String args[]){
		String s = "hello";
		String t = "leghL";
		int store[] = new int [256];
		for(int i=0; i < s.length(); i++){
			int val = s.charAt(i);
			store[val] = store[val] + 1;
		}
		
		for(int i=0; i < t.length(); i++){
			int val = t.charAt(i);
			store[val] = store[val] - 1;
		}
		
		/*for(int g : store)
			System.out.print(g + " ");*/
		for(int i=0; i < store.length; i++){
			if(store[i] < 0){
				System.out.println("Two Strings are NOT Anagram");
				System.exit(0);

				}
		}
		System.out.println("Two Strings are Anagram");
	}
}