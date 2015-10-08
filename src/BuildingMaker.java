/*
 * Space Needle Project
 * Nathan Fallahi
 * init 2015-09-30
 * last 2015-10-07
 */

// imports
import java.util.Scanner;

public class BuildingMaker {
	
	private static Scanner input;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.print("Hi! My name is Jeff, ");
		Thread.sleep(800);
		System.out.println("a Skynet Building Maker 2000.");
		Thread.sleep(1200);
		System.out.println("I can build a Space Needle, Eiffel Tower, or an apartment complex!");
		Thread.sleep(2000);
		System.out.println("Would you like me to build a building for you today?");
		Thread.sleep(1400);
		System.out.print("(Yes) ");
		Thread.sleep(800);
		System.out.print("or ");
		Thread.sleep(800);
		System.out.println("(no)?");
		input = new Scanner(System.in);
		String yesno = input.next();
		if (yesno.equals("Yes")) {
			System.out.println("What kind of building would you like me to build for you?");
			Thread.sleep(1400);
			System.out.print("(SpaceNeedle), ");
			Thread.sleep(800);
			System.out.print("(EiffelTower), ");
			Thread.sleep(800);
			System.out.println("or (ApartmentComplex)?");
			String buildingtype = input.next();
			if (buildingtype.equals("SpaceNeedle")) {
				System.out.print("All right, ");
				Thread.sleep(600);
				System.out.println("of what scale factor would you like your Space Needle to be made?");
				int scale = input.nextInt();
				System.out.print("Building");
				for (int i=0; i<3*scale; i++) {
					Thread.sleep(900);
					System.out.print(".");
				}
				System.out.println();
				System.out.println("Done.");
				Thread.sleep(1000);
				spaceNeedle(scale);
			} else if (buildingtype.equals("EiffelTower")) {
				System.out.println("ERROR! Eiffel Tower functionality currently unavailable!");
			} else if (buildingtype.equals("ApartmentComplex")) {
				System.out.println("ERROR! Apartment Complex functionality currently unavailable!");
			} else {
				System.out.println("I'm sorry, I don't understand what you mean by " + "'" + buildingtype + "'");
			}
			
		} else if (yesno.equals("no")) {
			System.out.print("Please find someone else to make sad ");
			Thread.sleep(1200);
			System.out.println(":(");
		} else {
			System.out.println("I'm sorry, I don't understand what you mean by " + "'" + yesno + "'");
			Thread.sleep(1300);
			System.out.println("Please try again.");
		}
	}
	
	public static void spaceNeedle(int scale) {
		// antenna
		for (int i=0; i<4*scale; i++) {
			for (int j=0; j<12*scale*scale; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<1*scale; j++) {
				System.out.print("||");
			}
			System.out.println();
		}
		
		// forehead
		for (int i=0; i<4*scale; i++) {
			for (int j=0; j<12*scale*scale-(i+1)*(scale*3); j++) {
				System.out.print(" ");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("__");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("/");
			}
			for (int j=0; j<i*scale; j++) {
				System.out.print(":::");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("||");
			}
			for (int j=0; j<i*scale; j++) {
				System.out.print(":::");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("\\");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("__");
			}
			System.out.println();
		}
		
		// line?
		for (int i=0; i<scale; i++) {
			System.out.print("|");
		}
		for (int i=0; i<24*scale*scale; i++) {
			System.out.print("\"");
		}
		for (int i=0; i<scale; i++) {
			System.out.print("|");
		}
		System.out.println();
		
		// chin
		for (int i=0; i<4*scale; i++) {
			for (int j=0; j<i*scale; j++) {
				System.out.print("  ");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("\\");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("_");
			}
			for (int j=12*scale*scale-(i)*(scale-1+scale); j-scale>i; j--) {
				System.out.print("/\\"); 
			}
			for (int j=0; j<scale; j++) {
				System.out.print("_");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("/");
			}
			System.out.println();
		}
		
		// neck
		for (int i=0; i<4*scale; i++) {
			for (int j=0; j<12*scale*scale; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<1*scale; j++) {
				System.out.print("||");
			}
			System.out.println();
		}
		
		// body
		for (int i=0; i<16*scale; i++) {
			for (int j=0; j<12*scale*scale-3*scale; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("|");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("%%");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("||");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("%%");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("|");
			}
			System.out.println();
		}
		
		// base
		for (int i=0; i<4*scale; i++) {
			for (int j=0; j<12*scale*scale-(i+1)*(scale*3); j++) {
				System.out.print(" ");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("__");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("/");
			}
			for (int j=0; j<i*scale; j++) {
				System.out.print(":::");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("||");
			}
			for (int j=0; j<i*scale; j++) {
				System.out.print(":::");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("\\");
			}
			for (int j=0; j<scale; j++) {
				System.out.print("__");
			}
			System.out.println();
		}
		
		// line2
		for (int i=0; i<scale; i++) {
			System.out.print("|");
		}
		for (int i=0; i<24*scale*scale; i++) {
			System.out.print("\"");
		}
		for (int i=0; i<scale; i++) {
			System.out.print("|");
		}
		System.out.println();
	}
	
	public static void eiffelTower() {
		
	}
	
	public static void apartment() {
		
	}
}
