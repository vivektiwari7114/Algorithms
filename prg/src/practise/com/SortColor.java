package practise.com;

import java.util.ArrayList;
import java.util.List;

public class SortColor {
	public static void main(String args[]){
		int nums[] = {2,0};
		int l = nums.length;
		int flag =0;
		List<Integer> lt = new ArrayList<Integer>();
		lt.add(0);lt.add(1);lt.add(2);
		
		for(int i=0; i < l; i++){
			flag =0;
			for(int k=0 ;k < lt.size(); k++){
				int item = lt.get(k);
				for(int j=i;j< l;j++){
					if(nums[j] == item){
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
						flag = 1;
						break;
					}
				}
				if(flag ==1 )
					break;
			
			}
		}
		System.out.println();
		for(int a : nums)
				System.out.print(a);
	}
}
