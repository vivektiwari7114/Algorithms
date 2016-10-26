package practise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class checkWorking {
	// Replace Space with %20 
	public static void main(String args[]){
		
		
		Set<Integer> st = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		st.add(1);
		st.add(2);
		st.add(9);
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(1);
		st.add(4);
		st.add(1);
		st.add(5);
		st.add(7);
		Iterator<Integer> it = st.iterator();
		while(it.hasNext()){
	       al.add(it.next());
	     }
		Collections.sort(al);
		System.out.println(al);
		
	
	}
}


