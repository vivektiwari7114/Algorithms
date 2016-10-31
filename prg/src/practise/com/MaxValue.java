package practise.com;

import java.util.*;

public class MaxValue {

	public static void main(String[] args) {
		int k=3;
		int nums[]={5,2,5,4,6,8};
		 if(nums==null||nums.length==1||nums.length==0){
	           // return nums;
			 System.exit(0);
	        }
	        
	        int[] ans = new int[nums.length-k+1];
	        int kMin = 0;
	        int kMax = k-1;
	        int presMax = findMinInX(nums,0,k-1);
	        ans[kMin] = presMax;
	        
	        for(int index = kMax;index<nums.length-1;index++){
	            kMin++; kMax++;
	            if(presMax>nums[kMax]){
	                presMax = nums[kMax];
	                ans[kMin] = presMax;
	            }
	            else{
	                if(nums[kMin-1]==presMax){
	                    presMax = findMinInX(nums,kMin,kMax);
	                    ans[kMin] = presMax;
	                }
	                else{
	                    ans[kMin] = presMax;
	                }
	            }
	        }
	        
	      // System.out.println(ans);
	       int max = Integer.MIN_VALUE;
	       for(int t: ans){
	    	   	max = Math.max(t, max);
	       System.out.println(t);
	       }
	      
	    }
	    
	    public static int findMinInX(int[] nums,int kMin,int kMax){
	        int ans = nums[kMin];
	        
	        for(int index = kMin+1;index<=kMax;index++){
	            if(nums[index]<ans){
	                ans = nums[index];
	            }
	        }
	        return ans;
	    }
}
