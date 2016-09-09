package practise.com;

public class ReplaceSpace {
	public static void main(String args[]){
		String str = "v iv ek";
		int l = str.length();
		int countSpace =0;
		for(int i=0 ; i < l; i++){	
			if(str.charAt(i) == ' ')
				countSpace++;
		}
		char store[] = new char[l+(countSpace * 2)];
		int i=0, j=0;
		while(i<l){
			if(str.charAt(i) == ' '){
				store[j++] = '%';
				store[j++] = '2';
				store[j++] = '0';
				
				
			}else{
				store[j] = str.charAt(i);
				j++;
			}
			i++;
		}
		String result = new String(store);
		System.out.println(result);
	}
}
