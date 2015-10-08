/*
 * Space Needle Project (proper)
 * Nathan Fallahi
 * 2015-10-07
 * 2015-10-07
 */
public class SpaceNeedle {
	
	final static int SIZE=4;
	
	public static void main(String[] args) {
		pole();
		forehead();
		chin();
		pole();
		body();
		forehead();
	}
	public static void pole(){
		for (int i=0; i<SIZE; i++){
			for (int j=0; j<3*SIZE; j++){
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	public static void forehead(){
		for (int i=1; i<=SIZE; i++){
			for (int j=0; j<SIZE*3-(i*3); j++){
				System.out.print(" ");
			}
			System.out.print("__/");
			for (int j=0; j<(i-1)*3; j++){
				System.out.print(":");
			}
			System.out.print("||");
			for (int j=0; j<(i-1)*3; j++){
				System.out.print(":");
			}
			System.out.print("\\__");
			System.out.println();
		}
		System.out.print("|");
		for (int i=0; i<SIZE*6; i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void chin(){
		for (int i=1; i<=SIZE; i++){
			for (int j=0; j<(i-1)*2; j++){
				System.out.print(" ");
			}
			System.out.print("\\_");
			for (int j=0; j<(3*SIZE+1)-2*i; j++){
				System.out.print("/\\");
			}
			System.out.println("_/");
		}
	}
	public static void body(){
		for (int i=0; i<=SIZE*4; i++){
			for (int j=0; j<(3*SIZE)-3; j++) {
				System.out.print(" ");
			}
				System.out.print("|");
			for (int j=0; j<(SIZE/4); j++) {
				System.out.print("%%");
			}
				System.out.print("||");
			for (int j=0; j<SIZE/4; j++) {
				System.out.print("%%");
			}
				System.out.print("|");
			System.out.println();
		}
	}
}