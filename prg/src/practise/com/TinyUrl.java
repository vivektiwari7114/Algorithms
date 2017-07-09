
package practise.com;
import java.util.*;
public class TinyUrl {

	 String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 HashMap<String, String> map = new HashMap<>();
	 int count = 1;
	 
	public static void main(String[] args) {
		String longUrl_testcase1 = "https://leetcode.com/problems/design-tinyurl";
		String longUrl_testcase2 = "https://leetcode.com/problems/design-tinyurl";
		TinyUrl tinyObject = new TinyUrl();
		System.out.println( tinyObject.encode(longUrl_testcase1) );
		System.out.println( tinyObject.encode(longUrl_testcase2) );
	}
	
	 public  String getString() {
	        int c = count;
	        StringBuilder sb = new StringBuilder();
	        while (c > 0) {
	            c--;
	            sb.append(chars.charAt(c % 62));
	            c /= 62;
	        }
	        System.out.println("Encoded String "+sb);
	        return sb.toString();
	 }
	 public  String encode(String longUrl) {
		 if(!map.containsKey(longUrl)){
	        String key = getString();
	        map.put(longUrl, key);
	        count++;
	        return "http://tinyurl.com/" + key;
		 }else{
			 return "http://tinyurl.com/" + map.get(longUrl);
		 }
	       
	 }
	 public String decode(String shortUrl) {
	        return map.get(shortUrl.replace("http://tinyurl.com/", ""));
	  }


}
