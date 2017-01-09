import java.util.Random;
import lattelib.WebLatte;

public class Yoda {
	public static void main(String[] args) {
		//declaration:
		String input;
		String name;
		WebLatte frame = new WebLatte();
		Random gen = new Random();
		
		//Yoda
		frame.println("Yoda, i am. You are?");
		name = frame.nextLine.toString();
		frame.println("hello, " + name + ", are you mad at me?");
		
		//start talking
		while (true){
			
		}
	}
}
