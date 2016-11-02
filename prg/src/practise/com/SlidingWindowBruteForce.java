package practise.com;

public class SlidingWindowBruteForce {

	public static void main(String[] args) {
		
		int nums[] = {1,3,-1,-3,5,3,6,7};
		int l = nums.length;
		int k = 3;
		int store[] = new int[l-k+1];
		for(int i=0; i < l-k+1; i++){
			int min = nums[i];
			for(int j =i+1; j< k+i; j++)
				min = Math.max(nums[j], min);
			store[i] = min;
			
		}
		/*int getMin = Integer.MAX_VALUE;
		for(int i=0; i < store.length; i++){
			if(store[i] < getMin)
					getMin = store[i];
		}
		System.out.println(getMin);*/
		for(int t: store)
			System.out.println(t + " ");
		

	}

}
