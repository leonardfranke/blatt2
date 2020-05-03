package blatt2;

import java.lang.Math;

/**
 * Represents the arena which is divided into 12 areas.
 * @author Leonard Franke
 *
 */
public class Arena
{
	/**
	 * Return the area in which the tribute is
	 * @param x x coordinate of the tribute
	 * @param y y coordinate of the tribute
	 * @return one of the 12 areas in which the tribute is, -1 if outside of the border
	 */
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
