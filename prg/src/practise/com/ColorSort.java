package practise.com;

/* Bounded Counting sort to sort colors 
 * Parameters: NA
 * Return :NA
 * Function:Given color implement color sorting alo
 */

public class ColorSort {
	public static void main(String args[]){
		int nums[] = {2,2,1,1,0,1,0};
		int l = nums.length;
		int count[] = new int[3];
		for(int i=0 ; i < l; i++)
			count[nums[i]]++;
		int j=0, k=0;
		while(j < count.length){
			if(count[j] != 0 ){
				nums[k] = j;
				count[j] = count[j] -1;
				k++;
				
			}else
				j++;
		}
		
	}

}
