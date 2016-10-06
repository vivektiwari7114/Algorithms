package practise.com;

public class kmpAlgo {
	public static void main(String args[]){
		String haystack = "vivekisgood";
		String needle = "isg";
		
		int h = haystack.length();
		int n = needle.length();
		
		int next[] = getNext(needle);
		for(int t: next)
			System.out.print(t);
		
	}
	public static int[] getNext(String needle){
		int next[] = new int[needle.length()];
		next[0] = 0;
		for(int i = 1; i< needle.length(); i++){
			int index = next[i-1];
			while(index > 0 && needle.charAt(index) != needle.charAt(i)){
				index = next[index-1];
			}
			if(needle.charAt(index) == needle.charAt(i)){
				next[i] = next[i-1] +1;
			}else{
				next[i] = 0;
			}
		}
		return next;
	}

}
