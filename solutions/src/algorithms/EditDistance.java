package practise.com;

public class EditDistance {
	public static void main(String args[]){
	String s = "sunday";
	String t = "saturday";
 
    int m = s.length();
    int n = t.length();
 
 
    int i=0; 
    int j=0; 
    int count=0;
 
    while(i<m&&j<n){
    	System.out.println("i "+i + " j "+j);
        if(s.charAt(i)==t.charAt(j)){
            i++;
            j++;
        }else{
            count++;
            if(m>n){
                i++;
            }else if(m<n){
                j++;
            }else{
                i++;
                j++;
            }
        }
    }
    System.out.println(count);
 
    if(i<m||j<n){
        count++;
    }
 
   
 
   System.out.println(count);
	}
	
}
