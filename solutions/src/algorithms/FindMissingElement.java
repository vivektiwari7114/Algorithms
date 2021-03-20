package practise.com;

public class FindMissingElement {
		public static void main(String args[]){
			
			int input[]  = {1,2,0,4,5};
			int n = input.length;
			String inpString[] =  new String[n];
			int noOfOnes = 0, noOfZeroes = 0;
			for(int i=0; i< n; i++){
				inpString[i] = Integer.toBinaryString(input[i]);
				System.out.println(inpString[i]);
			}
			if(n%2 ==0){
				//Even Part
				
				
				
			}else{
				//Odd Part
				for(int i=0;i< n; i++){
				
				}
				
			}
			
		}

}
