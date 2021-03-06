package practise.com;

/* Name: Equilibrium Index Brute Force
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Given an array find the equilibrium index
 */
class EquilibriumIndex {
	public static void main(String args[]){
		int A[] = {0, 1,2,3,4,5,6 };
		System.out.println(new EquilibriumIndex().solution(A));
	}
	
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0)
            return -1;
        int l = A.length;
        double leftSum =0, rightSum =0;
        for(int i=0; i < l;i++){
            leftSum = 0;
            rightSum =0;
            for(int j =0; j<i; j++)
                leftSum = leftSum + A[j];
            for(int j =i+1; j<l; j++)
                rightSum = rightSum + A[j];
            if(leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
