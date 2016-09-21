package practise.com;

import java.util.ArrayList;
import java.util.List;

public class MultipleOf357 {
	public static void main(String args[]){
	int n = 5;
	List<Integer> st = new ArrayList<Integer>();
	st.add(1);
	int count3 =0;
	int count5 = 0;
	int count7 =0;
	for(int i=0 ; i< n-1; i++){
		
		int m = Math.min(Math.min(st.get(count3) * 3, st.get(count5) * 5), st.get(count7) * 7);
		st.add(m);
		if( m == st.get(count3 )*3 ) count3++;
		if( m == st.get(count5 )*5 ) count5++;
		if( m == st.get(count7 )*7) count7++;
		
	}
	System.out.println(st.get(st.size()-1));
	
	}
}
