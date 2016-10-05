package practise.com;

public class strStr {
		public static void main(String args[]){
			String h = "vivekisgood";
			String n = "isg";
		
			int l1 = h.length();
			int l2=  n.length();
			
			for(int i=0; i< l1; i++){
				
				int m = i;
				for(int j =0; j< l2;j++){
					if(h.charAt(m) == n.charAt(j)){
						if(j == l2-1){
							System.err.println("Pass "+i);
							System.exit(0);
						}
					m++;
					}else
						break;
				}
			}
			
			System.out.println("Fail");
			
		}

}
