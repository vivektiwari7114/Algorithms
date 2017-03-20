package practise.com;

public class reverseString {
	public static void main(String args[]){
		String s = "abcd";
		char t[] = s.toCharArray();
		System.out.println( reverseString(t) );
	}
	public static  String reverseString(char[] t){
		int l = t.length;
		int i=0, j = l-1;
		while(i < j){
			char temp = t[i];
			t[i] = t[j];
			t[j] = temp;
			i++;
			j--;
		}
		return new String(t);
	}
}
