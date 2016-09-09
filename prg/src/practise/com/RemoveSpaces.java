package practise.com;

import java.util.Arrays;

public class RemoveSpaces {
	public static void main(String args[]){
		char[] str = "vvvvvvv".toCharArray();
		int l = str.length;
		int tail = 0;
		for(int i=0; i < l;i++){
			int j;
			for(j=0;j<tail;j++){
				if(str[i] == str[j])
						break;
			}
			if(j == tail){
				str[tail] = str[i];
				tail++;
			}
		}
		str[tail] = '#';
		System.out.println(str);
	}
}
