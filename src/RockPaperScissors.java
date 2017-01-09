import lattelib.WebLatte;

public class RockPaperScissors {
	public static void main(String[] args) {
		char userPick;
		char computerPick;
		int timesWon;
		int timesLost;
		int timesTied;
		char userPick;
		
		WebLatte frame = new WebLatte();
		
		while(true){
			frame.println("<span style='font-size: 48px;'>Welcome to 🐻🏹👸!</span>");
			frame.println("<span style='font-size: 14px;'>🐻 Eats 👸, 👸 charms 🏹, and 🏹 kills 🐻</span>");
			frame.println("Type B for 🐻, P for 👸, and H for 🏹. The computer will pick a random player for you to compete against. Good luck!");
			userPick = frame.nextLine().toString().charAt(0).toChar()
			frame.(userPick +"");
		}
	}
}
