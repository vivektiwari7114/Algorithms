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
		System.out.println("z".compareTo("a"));
	/*	int a = 40;
		int b = 1;
		int c = multiplybyAddition(a, b);
		System.out.println(c);*/
		
}
	public static int multiplybyAddition(int a, int b){
		
		int sum = 0;
		while(b >0){
			sum = sum + a;
			b--;
		}
		return sum;
	}
}


