package practise.com;

public class GenerateEnglishPhrases {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		int num = 100;
		int len = 1;
		while(Math.pow(10, len) < num ){
			len++;
		}
		String[] wordarr1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] wordarr11 = {"", "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] wordarr10 = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] wordarr100 = {"", "hundred", "thousand"};
		System.out.println("Length "+len);
		int tmp;
		if(num == 0)
			sb.append("Zero");
		else{
			if(len > 3 && len % 2 == 0){
				len ++;
			}
			do{
				if(len > 3){
					tmp = (num/(int)Math.pow((double)10, (double)len -2));
					if(tmp/10 == 1 && tmp%10 != 0)
							sb.append(wordarr11[tmp%10]);
					else{
						sb.append(wordarr10[tmp/10]);
						sb.append(wordarr1[tmp%10]);
					}
					if(tmp > 0)
						sb.append(wordarr100[len/2]);
					num = num % (int)(Math.pow((double)10, (double)len -2));
					len = len -2;
				}else{
					tmp = num /100;
					if(tmp != 0){
						sb.append(wordarr1[tmp]);
						System.out.println(sb);
						sb.append(wordarr100[len / 2]);
						System.out.println(sb);
					}
					tmp = num %100;
					if(tmp / 10 == 1 && tmp % 10 != 0)
						sb.append(wordarr11[tmp % 10]);
					else{
						sb.append(wordarr10[tmp / 10]);
						sb.append(wordarr1[tmp % 10]);
					}
					len =0;
				}
			}while(len > 0);
		}
		System.out.println(sb.toString());
	}
}
