import lattelib.WebLatte;

/*
 * Calculator.java
 * @author William Barkoff        
 *
 * Takes an operand, an operator, another
 * operand, and then prints the result
 * 
 * ©2016 William Barkoff
 */

public class Calculator {
	public static void main(String[] args) {
		//Declaratons
		double num1; //The first number that the user enters
		double num2; //The second number that the user enters
		char operator; //The operator
		double result;
		WebLatte frame = new WebLatte(); //Setup WebLatte

		//Ask for an operand
		frame.println("Hello and welcome to the calculator game! 😀");
		while(true){
			frame.println("Please enter a number");
			num1 = frame.nextLine().toDouble();

			//Ask for an operator
			frame.println("Awesome, now enter your operator!");
			frame.println("Your equation so far: <span style='color: blue;'>" + num1 + "</span>");
			operator = frame.nextLine().toChar();

			//Ask for second operand
			frame.println("Please enter your other number!");
			frame.println("Your equation so far: <span style='color: blue;'>" + num1 + "</span><span style='color: green;'> " + operator);
			num2 = frame.nextLine().toDouble();
			
			
			frame.println("Your final equation: <span style='color: blue;'>" + num1 + "</span> <span style='color: green;'>" + operator + "</span> = </span style='color: red>" + num2 + "</span>");	
			if(operator == '+') {
				result = num1 + num2;
			} else if(operator == '-') {
				result = num1 - num2;
			} else if(operator == '/') {
				result = num1 / num2;
			} else if(operator == '*') {
				result = (num1 * num2);
			} else {
				frame.println("That's invalid. Goodbyte");
				return;
			}

			if (operator=='/') {
				frame.println(result + ", or " + (int)num1/(int)num2 + " remainder " + num1%num2);
			} else {
				frame.println(Double.toString(result));

			}
		}
	}
}