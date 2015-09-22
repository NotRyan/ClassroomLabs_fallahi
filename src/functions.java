/*
 * functions done in class
 * Nathan Fallahi
 * init 2015-09-21
 * last 2015-09-22
 */

// imports
import java.util.Scanner; 

public class functions {

	public static void main(String[] args) {
		System.out.println("What is your calculation?");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		System.out.println(calculate(num1, op, num2));

	}
	
	public static int calculate(int num1, String op, int num2) {
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
