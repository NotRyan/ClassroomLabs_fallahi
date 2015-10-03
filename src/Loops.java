
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numLoop();
//		goalPost();
//		box();
//		nestedBox();
		test1(2);
	}
	
	public static void numLoop() {
		for(int i=2; i<11; i+=2) {
			System.out.print(i + " ");
		}
	}
	
	public static void goalPost() {
		for (int i=0; i<4; i++) {
			System.out.println("**\t\t**");
		}
		for (int i=0; i<2; i++) {
			System.out.println("******************");
		}
		for (int i=0; i<4; i++) {
			System.out.println("\t**");
		}
	}
	
	public static void box() {
		for (int i=0; i<5; i++) {
			System.out.println("* * * * *");
		}
	}
	
	public static void nestedBox() {
		for (int i=0; i<30; i++) {
			for (int j=0; j<30; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void test1(int scale) {
		for (int i=0; i<7*scale; i++) {
			for (int j=0; j<5*scale; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
