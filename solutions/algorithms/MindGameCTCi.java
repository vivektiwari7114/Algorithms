package practise.com;

public class MindGameCTCi {
	public static void main(String args[]){
		String sol = "RRGB";
		String guess = "YGGB";
		int hit = 0;
		int phit =0;
		Result res = new Result();
		int solution_mask = 0;
		for(int i=0; i < 4; i++){
			solution_mask |= 1 <<(1+sol.charAt(i) - 'A');
		}
		
		for(int i=0; i < 4; i++){
			if(guess.charAt(i) == sol.charAt(i)){
				res.hits++;
			}else if (  (solution_mask & ( 1 <<(1+guess.charAt(i) - 'A'))) >= 1 )
			res.pseudoHits++;
		}
		System.out.println(res.hits);
		System.out.println(res.pseudoHits);
		
	}

}

class Result {
	public int hits;
	public int pseudoHits;
}

