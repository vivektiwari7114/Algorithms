package practise.com;

import java.util.HashMap;
import java.util.Map;

public class FIndMostNumberOfPoints {
	public static void main(String args[]){
		//Initialize all the points
		Points p1 = new Points(2,0);
		Points p2 = new Points(3,0);
		Points p3 = new Points(4,0);
		Points p4 = new Points(5,0);
		Points p5 = new Points(4,8);
		
		Points p[] = new Points[5];
		p[0]=p1;p[1]=p2;p[2]=p3;p[3]=p4;p[4]=p5;
		Map<Line, Integer> mp = new HashMap<Line, Integer>();
		for(int i=0; i < p.length; i++){
			for(int j = i+1; j < p.length; j++){
				Line temp = new Line(p[i], p[j]);
				if(!mp.containsKey(temp))
					mp.put(temp, 0);
				else
					mp.put(temp, mp.get(temp) + 1);
			}
			
		}
		System.out.println(mp);
		
	}

}
class Points{
	double x;
	double y;
	public Points(double x, double y){
		this.x = x;
		this.y = y;
	}
}
class Line{
	double ep = 0.0001;
	double  slope;
	double  intercept;
	boolean infiniteSlope= false;
	public Line(Points p1, Points p2){
		if(Math.abs(p1.x - p2.x ) < ep ){
			this.slope = (p1.y - p2.y)/(p1.x - p2.x);
			this.intercept = p1.y -(this.slope)* p1.x;
		}else{
			infiniteSlope = true;
			this.intercept = p1.x;
			
		}
	}
	
	
}
