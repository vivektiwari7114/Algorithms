package practise.com;

public class searchIndexes {
	public static void main(String args[]){
		int nums[] = {1,2,3,4,5,6,7};
		int target = 6;
		int l = nums.length;
        if(l == 0)
            return ;
        int low = 0;
        int high = l-1;
        while(low <= high){
            int mid = low +((high - low)/2);
            if(target < nums[mid])
                high = mid -1;
            else if(target > nums[mid])
                low = mid + 1;
            else{
               System.out.println(mid);
               System.exit(0);
            }
        }
        
        if(target < nums[0]){
        	 System.out.println("0");
             System.exit(0);
        }
        else if(target > nums[l-1]){
        	 System.out.println(l);
             System.exit(0);
        }
        else{
            for(int i=0; i < l-1; i++){
                if(target > nums[i] && target < nums[i+1]){
                	 System.out.println(i+1);
                     System.exit(0);
                }
                    
            }
        }
		
	}
}
