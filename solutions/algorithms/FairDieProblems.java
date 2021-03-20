package practise.com;

public class FairDieProblems {
	public static void main(String args[]){
		System.out.println(payoffs(5));
	}
	public static double payoffs(int n){
		if(n==0)
			return 3.5;
		else if (n== 1)
				return 4.25;
		else if (n== 2)
			return 4.66;
		else if (n== 2)
			return 4.25;
		else if (n== 3)
			return 4.94;
		else{
			double factor = Math.pow(5.0/6, n-4);
			System.out.println("Factor: "+factor);
			double answer = (factor * (277.0/54) ) + 6 - (6 * factor);
			System.out.println("Answer: "+answer);
			return answer;
		}
	}

}
