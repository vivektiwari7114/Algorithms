package practise.com;


/* Class Name: Find the line that  cuts the square in equal parts
 * Parameters: Not Applicable
 * Return :Void
 * Function: Classes: Points, Line, Square
 */
public class LineThroughSquare {
	public static void main(String args[]){
		Point ps1 = new Point(0,0);
		Point ps2 = new Point(1,1);
		Square s1 = new Square(ps1,ps2);
		Point ps3 = new Point(1000,1000);
		Point ps4 = new Point(1,1);
		Square s2 = new Square(ps3,ps4);
		LinesL l2 =s1.calculateLine(s2);
		System.out.println("x1: "+l2.p1.x + " y1: "+l2.p1.y);
		System.out.println("x2: "+l2.p2.x + " y2: "+l2.p2.y);
		
	}
}
class Square{
	Point p1;
	Point p2;
	double eplsilon = 0.0001;
	public Square(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public LinesL calculateLine(Square s2){
		double xmid1 = (p1.x + p2.x)/2;
		double  ymid1 = (p1.y + p2.y)/2;
		
		double xmid2 = (s2.p1.x + s2.p2.x)/2;
		double ymid2 = (s2.p1.y + s2.p2.y)/2;
		
		if(Math.abs(xmid1 -xmid2) <  eplsilon  &&  Math.abs(ymid1 -ymid2) < eplsilon)
			return new LinesL(p1, p2);
		else
			return new LinesL(new Point(xmid1, ymid1), new Point(xmid2, ymid2));
				
		
	}
}
class LinesL{
	Point p1;
	Point p2;
	public LinesL(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
}
class Point{
	double x;
	double y;
	public Point (double x, double y){
		this.x = x;
		this.y = y;
	}
}