package practise.com;

public class Print_English_Equivalent {
	public static void main(String args[]){
		
		int given_num = 45;
		System.out.println( printInEnglish(given_num));
		
		
			
		
		
	}
	public static String printInEnglish(int num){
		StringBuilder sb = new StringBuilder();
		String first[] = {"", "one", "two","three","four", "five", "six","seven" , "eight", "nine","ten"};
		String second[] = {"", "eleven", "twelve","thirteen","fourteen ", "fifteen", "sixteen","seventeen" , "eighteen", "nineteen","twenty"};
		String third [] = {"", "ten","twenty", "thirty","forty","fifty ", "sixty", "seventy","eighty", "ninty"};
		String fourth [] = {"", "hundred", "thousand"};
		
		int len = Integer.toString(num).length();
		int temp;
		if(num == 0)
			return "zero";
		if( len > 3 && len % 2 == 0 )
			len++;
		
		do{
			if(len > 3 ){
				
			}
		}
		

		
		
		
		return "";
	}
}
