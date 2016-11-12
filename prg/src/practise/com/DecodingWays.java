package practise.com;

public class DecodingWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		
		if(s== null || s.length() == 0)
				return ;
		int l = s.length();
		if(l == 1)
				return ;
		int dp[] = new int[l];
		
		int num = Integer.parseInt( s.substring(0, 2) );
		if( num <= 26){
			if(s.charAt(1) == '0' )	
					dp[1] = 1;
			else
					dp[0] = 2;
		}else{
			if(s.charAt(1) == '0' )	
				dp[1] = 0;
		else
				dp[0] = 1;
			
		}

	}

}
