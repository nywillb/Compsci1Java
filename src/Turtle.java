import lattelib.Color;
import lattelib.WebLatte;

/*
 * William Barkoff
 * Turtle.java
 * Made for Dalton Computer Science 1
 * 
 * ©2016
*/


public class Turtle {
	public static void main(String[] args) {
		WebLatte frame = new WebLatte();

		frame.drawImage("http://www.pets4homes.co.uk/images/articles/2059/large/turtles-that-live-on-land-5401b653e50dd.jpg", 300, 300, 426.66666667, 296.33333333, 0);

		//frame.drawEllipse(758, 453, rx, ry, rot, Color.DarkOliveGreen);
		
		frame.paint();
	}
}
