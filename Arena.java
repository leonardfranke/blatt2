package blatt2;

import java.lang.Math;

public class Arena
{
	int getArea(double x, double y) {
		if( Math.sqrt(x*x + y*y) > 1.5) {
			return -1;
		}
		
		double angle = Math.atan(y / x) + Math.PI/2;
		System.out.println("angle: " + angle);
		
		int area = (int) (angle/(2*Math.PI));
		
		return area;
		
	}
}
