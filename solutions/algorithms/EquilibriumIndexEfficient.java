package practise.com;


/* Name: Find the Equilibrium Index in an array
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Find the euilibrium index in an array
 */
public class EquilibriumIndexEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] ={-7,1,5,2,-4,3,0};
		int index = getEquilibriumIndex(array);
		System.out.println(index);

	}
	public static int getEquilibriumIndex(int array[]){
		
		int l = array.length;
		int sum = 0;
		int leftSum = 0;
		for(int i=0; i < l;i++)
				sum = sum + array[i];
		
		for(int i=0; i < l ; i++){
			sum = sum - array[i];
			if(sum == leftSum)
					return i;
			leftSum = leftSum + array[i];
		}
		return -1;
		
	}

}
