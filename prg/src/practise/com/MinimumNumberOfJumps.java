package practise.com;

public class MinimumNumberOfJumps {
	public static void main(String args[]){
		int a[] = {0,3,6,1,0,9};
		int l = a.length;
		
		int jumps[] = new int[l];
		jumps[0] = 1;
		for(int i=1; i < l;i++){
			jumps[i] = Integer.MAX_VALUE;
			for(int j=0; j < i ; j++){
				if(i <= j + a[j] && jumps[j] != Integer.MAX_VALUE)
					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
			}
		}
		//System.out.println("Min Jumps: "+jumps[l-1]);
		
		for(int t : jumps)
				System.out.print(t + " ");
	}
}
