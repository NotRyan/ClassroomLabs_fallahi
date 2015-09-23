/*
 * functions done in class
 * Nathan Fallahi
 * init 2015-09-21
 * last 2015-09-22
 */

// imports
import java.util.Scanner; 

public class functions {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("What is your calculation?");
		input = new Scanner(System.in);
		
		// scans for imput
		double num1 = input.nextDouble();
		String op = input.next();
		double num2 = input.nextDouble();
		
		// sets up answer
		double answer = calculate(num1, op, num2);
		
		// checks for and cleans up decimal
		if (answer % 1 == 0) {
			int rAnswer = (int) answer;
			System.out.println(rAnswer);
		} else {
			System.out.println(answer);
		}
	}
	
	public static double calculate(double num1, String op, double num2) {
		switch (op.charAt(0)) {
		case '+': 
			return num1 + num2;
		case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        case '/':
            return num1 / num2;
		}
		throw new IllegalArgumentException("Unknown operator:" + op);
	}
	
}
