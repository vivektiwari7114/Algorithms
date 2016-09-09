package practise.com;

public class MinimumDrop {
	public static void main(String args[]){
	int noOfEggs = 2;
	int noOfFloors = 36;
	MinimumDrop mp = new MinimumDrop();
	System.out.println( mp.getMinimumDrops(noOfEggs, noOfFloors) );
	}
	public  int getMinimumDrops(int n , int k){
		
		if(k ==1 || k ==0)
			return k;
		if(n == 1)
			return k;
		int res = 0, min = 999;
		System.out.println(min);
		for(int x = 1; x <= k; x++){
			res = Integer.max( getMinimumDrops(n-1, x-1), getMinimumDrops(n, k-x) );
			if(res < min)
				min = res;
		}
		return min+1;
	}
}
