package snappractise;

import java.util.Arrays;
import java.util.Comparator;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intervals interval[] = new Intervals[3]; 
		interval[0] = new Intervals(0,30);
		interval[1] = new Intervals(5,10);
		interval[2] = new Intervals(15, 20);
		
		Arrays.sort(interval, new Comparator<Intervals>(){
			public int compare(Intervals a, Intervals b){
				return (a.start  - b.start);
			}
			
		});
		for(Intervals t: interval)
				System.out.println(t.start +" "+t.end);

	}

}
class Intervals{
	
	int start;
	int end;
	public Intervals(int x, int y){
		start = x;
		end = y;
		
	}
}
