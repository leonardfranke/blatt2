package blatt2;

import java.lang.Math;

public class Arena
{
	int getArea(double x, double y) {
		if( Math.sqrt(x*x + y*y) > 1.5) {
			return -1;
		}
		
		double angle = Math.toDegrees(Math.atan(x / y));
		
		if(y >= 0) {
			angle += 360;
		} else if (y < 0) {
			angle += 180;
		}
		angle %= 360;
		int area = (int) (angle*12/360);
		
		return area;
		
	}
}
