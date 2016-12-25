package practise.com;

public class MindGame2 {
	public static void main(String args[]){
		String solution = "RRGB";
		String guess = "GGGB";
		int solution_mask = 0;
		int resHit =0;
		int psHit = 0;
		for(int i=0; i < 4; i++){
			System.out.println( 1 << (1 + solution.charAt(i) - 'A'));
			solution_mask |= 1 << (1 + solution.charAt(i) - 'A');
			System.out.println("Intermediate "+solution_mask);
			//System.out.println(solution_mask);
		}
		System.out.println("Final Solution mask :"+solution_mask);
		for(int i=0; i< 4; i++){
			if(guess.charAt(i) == solution.charAt(i))
				resHit++;
			else if( (solution_mask &  (1 << (i + guess.charAt(i) - 'A' ) )) >= 1)
				psHit++;
		}
		
		System.out.println("Hits: "+resHit );
		System.out.println("Psuedo Hits: "+psHit );
	}

}
