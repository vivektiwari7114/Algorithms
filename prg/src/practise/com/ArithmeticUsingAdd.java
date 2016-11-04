package practise.com;

public class ArithmeticUsingAdd{
    public static void main(String args[]){
        
        int a = 0;
        int b = 0;
      //  System.out.println(subtract(a,b));
       // System.out.println(multiply(a,b));
        System.out.println(division(a,b));
    
    }
    public static int  compliment(int a ){
     int val = a > 0? -1: 1;
     
     int sum = 0;
     while(a != 0){
         sum = sum + val;
         a = a + val;
     }
     return sum;
    
    }
    public static int subtract(int a , int b){
    
        return (a + compliment(b));
    }
    
    public static int multiply(int a , int b ){
            if(b > a) 
                return multiply(b,a);
            int val = b > 0? -1:1;
            a = b > 0? a : compliment(a);
            int sum =0;
            while(b != 0){
                sum = sum + a;
                b = b + val;
            }
            return sum;
    
    }
    public static int absolute(int a){
    	int sum = a > 0? a: compliment(a);
    	return sum;
    }
    public static int division(int a , int b){
    	if(b ==0)
    			return -1;
    	if (a==0)
    			return 0;
    	 int c = absolute(a);
    	 int d = absolute(b);
    	int quotient =0; 
    	while(c >= d){
    		quotient++;
    		c = c-d;
    	}
    	if(a < 0 && b <0 || a > 0 && b > 0)
    			return quotient;
    	else
    		return compliment(quotient);
    	 
    
    }

}
