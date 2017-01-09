import lattelib.WebLatte;

public class HelloWorld {
	public static void main(String[] args) {
		WebLatte frame = new WebLatte();
		
		frame.println("<style>@import url('https://fonts.googleapis.com/css?family=Lato')</style>");
		frame.println("<style>body { font-family: 'Lato', sans-serif;</style>");
		
		//Hello World!
		frame.println("<span style=\"font-size: 80px;\">Hello World!</span>");
		frame.println("What is your name");
		
		//Get user name and say hello
		String name = frame.nextLine().toString();
		frame.println("Hello " + name);
		
		frame.println("PLease enter a noun");
		String noun1 = frame.nextLine().toString();
		
		frame.println("PLease enter a number");
		String number1 = frame.nextLine().toString();
		
		frame.println("PLease enter an adjective");
		String adj1 = frame.nextLine().toString();
		
		frame.println("PLease enter a place");
		String place1 = frame.nextLine().toString();
		
		frame.println("\n\nYour Story");
		frame.println("The " + adj1 + " warrior ate a " + noun1 + ".");
		frame.println("then he went to " + place1 + " for a break.");
		frame.println("Then he balanced " + number1 + " apples on his head.");
		frame.println("\n\nthanks for playing! 😀");
	}
}
