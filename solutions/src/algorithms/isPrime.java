package practise.com;

/* Name: isPrime Class
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: To  Count the number of Prime number to the given number
 */
public class isPrime {
	public static void main(String args[]){
		int n = 10;
		int count = 0;
        boolean[] isPrime = new boolean[n];
        for(int i=2; i<n ;i++)
            isPrime[i] = true;
        
        for(int i=2 ; i < Math.sqrt(n); i++){
            if(!isPrime[i]) 
                continue;
            for(int j = i*i; j < n ; j=j+i)
                isPrime[j] = false;
             }
        for(int j =2; j< n ;j++)
            if(isPrime[j])
                count ++;
        System.out.println(count);
	}

}
