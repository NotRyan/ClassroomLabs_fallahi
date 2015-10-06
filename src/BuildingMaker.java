/*
 * Space Needle Project
 * Nathan Fallahi
 * init 2015-09-30
 * last 2015-10-03
 */

// imports
//import java.util.Scanner;
//import java.lang.Math.pow;

public class BuildingMaker {
	
//	private static Scanner input;
	
	public static final int SCALE = 1;
	
	public static void main(String[] args) {
//		System.out.println("Hi! My name is Jeff, a Skynet Building Maker 2000.");
//		System.out.println("I can build a Space Needle, Eiffel Tower, or an apartment complex!");
//		System.out.println("Would you like me to build a building for you today?");
//		System.out.print("(Yes) or (no): ");
//		input = new Scanner(System.in);
//		String yesno = input.next();
//		if (yesno.equals("Yes")) {
//			System.out.println("Okay");
//		} else if (yesno.equals("no")) {
//			System.out.println("Please find someone else to make sad :(");
//		} else {
//			System.out.println("Do you want to try again?");
//		}
		
		spaceNeedle();
	}
	
	public static void spaceNeedle() {
		// antenna
		for (int i=0; i<4*SCALE; i++) {
			for (int j=0; j<12*SCALE; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<1*SCALE; j++) {
				System.out.print("||");
			}
			System.out.println();
		}
		
		// head1
		for (int i=3*SCALE; i>-1; i--) {
			for (int j=-3*i*SCALE; j+i<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<SCALE; j++) {
				System.out.print("__");
			}
			for (int j=0; j<SCALE; j++) {
				System.out.print("/");
			}
			for (int j=3; j>i; j--) {
				System.out.print(i);
			}
//			for (int j=0; j<SCALE; j++) {
//				System.out.print("||");
//			}
//			for (int j=4*SCALE; j>i; j--) {
//				System.out.print(":::");
//			}
//			for (int j=0; j<SCALE; j++) {
//				System.out.print("\\");
//			}
//			for (int j=0; j<1*SCALE; j++) {
//				System.out.print("__");
//			}
			System.out.println();
		}
	}
	
	public static void eiffelTower() {
		
	}
	
	public static void apartment() {
		
	}
}
