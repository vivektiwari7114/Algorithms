package practise.com;

public class FindMissingChar {
	public static void main(String args[]){
		String s = "abcd";
		String t = "abced";
		int res = (int)t.charAt(t.length() - 1);
		
		
        for(int i = 0; i < s.length(); i++){
            res = res ^ (int)s.charAt(i) ;
            res = res ^  (int)t.charAt(i);
        }
       System.out.println((char)res);
        
       
	}

}
