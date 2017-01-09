import lattelib.Color;
import lattelib.WebLatte;

/*
 * William Barkoff
 * Drawing.java
 * Made for Dalton Computer Science 1
 * 
 * ©2016
*/

public class Drawing {
	public static void main(String[] args) {
		WebLatte frame = new WebLatte();
				
		frame.drawCircle(200, 200, 100, Color.LightSalmon);
		
		frame.drawRectangle(300, 300, 200, 100, 45, Color.Beige);
		
		frame.drawText("hello", 600, 600, 30, 0, Color.Azure);
		frame.paint();
		
		frame.drawImage("http://www.thisiscolossal.com/wp-content/uploads/2014/04/tore.gif", 400, 400, 91.428571429, 51.428571429, 30);

		
	}
}
