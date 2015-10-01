/*
 * Space Needle Project
 * Nathan Fallahi
 * init 2015-09-30
 * last 2015-09-30
 */

// imports
import java.util.Scanner;

public class BuildingMaker {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		System.out.println("Hi! My name is Jeff, a Skynet Building Maker 2000.");
		System.out.println("I can build a Space Needle, Eiffel Tower, or an apartment complex!");
		System.out.println("Would you like me to build a building for you today?");
		System.out.print("(Yes) or (no): ");
		input = new Scanner(System.in);
		String yesno = input.next();
		if (yesno.equals("Yes")) {
			System.out.println("Okay");
		} else if (yesno.equals("no")) {
			System.out.println("Please find someone else to make sad :(");
		} else {
			System.out.println("Do you want to try again?");
		}
	}
	
	public static void spaceNeedle() {
		
	}
	
	public static void eiffelTower() {
		
	}
	
	public static void apartment() {
		
	}
}
