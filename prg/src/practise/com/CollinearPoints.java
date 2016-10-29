package practise.com;

import java.util.*;


/* Bounded Collinear points 
 * Parameters: NA
 * Return :NA
 * Function: Find Collinear points 
 */
public class CollinearPoints {
	public static void main(String args[]){
		PointsM p1[] = new PointsM[3];
		p1[0] = new PointsM(2,3);
		p1[1] = new PointsM(3,3);
		p1[2] = new PointsM(-5,3);
		int l = p1.length;
		int max =0;
		Map<Double, Integer> mp = new HashMap<Double, Integer>();
		for(int i=0; i < l; i++){
			int duplicate = 1;
			int vertical = 0;
			for(int j = i+1 ; j < l ; j++){
				if(p1[i].x == p1[j].x){
					if(p1[i].y == p1[j].y)
							duplicate ++;
					else
							vertical ++;
				}else{
					double slope = ( 1.0 *(p1[i].y -p1[j].y) ) / ( p1[i].x - p1[j].x);
					if( !mp.containsKey(slope))
						mp.put(slope, 1);
					else
						mp.put(slope, mp.get(slope) + 1);
				}
			}
			System.out.println(mp);
			//System.out.println(mp);
			for(Integer count : mp.values()){
				if(duplicate + count > max)
					max = count + duplicate;
			}
			max = Math.max(vertical + duplicate, max);
			mp.clear();
		}
		System.out.println(max);
		
		
	}

}
class PointsM{
	int x;
	int y;
	public PointsM(int x, int y){
		this.x = x;
		this.y = y;
	}
}
