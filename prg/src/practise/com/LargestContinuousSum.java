package practise.com;

public class LargestContinuousSum {
		public static void main(String args[]){
			int a[] = {2,-8,3,-2,4,-10};
			int max = a[0];
			for(int i=1; i< a.length;i++){
				int sum =0;
				for(int j=i; j >=0 ; j--){
					//System.out.println(" "+sum);
					sum = sum + a[j];
					if(sum> max){
						max = sum;
					}
				}
			}
			System.out.println(max);
		}

}
