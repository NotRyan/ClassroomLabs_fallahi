/*
 * Figures3 - Figures a lot more
 * Nathan Fallahi
 * init 2015-09-15
 * last 2015-09-15
 */

public class figures3 {
	
	public static void main(String[] args) {
		top();
		bot();
		System.out.println();
		bot();
		line();
		System.out.println();
		top();
		stop();
		bot();
		System.out.println();
		top();
		line();
	}
	
	/*
	 * Draw egg
	 */
	public static void top() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	
	/*
	 * Draw tea cup
	 */
	public static void bot() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	
	/*
	 * Draw stop sign
	 */
	public static void stop() {
		System.out.println("|  STOP  |");
	}
	
	/*
	 * draw hat
	 */
	public static void line() {
		System.out.println("+--------+");
	}
}
