/*
 * functions done in class
 * Nathan Fallahi
 * init 2015-09-21
 * last 2015-09-21
 */

// imports
import java.util.Scanner; 

public class functions {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("First number: ");
		int num1 = scanner.nextInt();
		System.out.print("Second number: ");
		int num2 = scanner.nextInt();
		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);
		
	}
	
	/*
	 * Addition
	 */
	public static void add(int x, int y) {
		System.out.println("Adding numbers gives a sum of " + (x + y));
	}
	
	/*
	 * Subtraction
	 */
	public static void subtract(int x, int y) {
		System.out.println("Subtracting numbers gives a difference of " + (x - y));
	}
	
	/*
	 * Multiplication
	 */
	public static void multiply(int x, int y) {
		System.out.println("Multiplying numnbers gives a product of " + (x * y));
	}
	
	/*
	 * Division
	 */
	public static void divide(int x, int y) {
		System.out.println("Dividing numbers gives a product of " + (x / y));
	}
}
