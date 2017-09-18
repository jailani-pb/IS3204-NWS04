package week9;

public class LearningPassingArgsByValues {

	static int z = 57;
	
	public static void main(String[] args) {
		int x = incrementBy10(30);
		System.out.println(x);
		int y = 88;
		int incrementedY = incrementBy10(y);
		System.out.println("This is y and incrementedY");
		System.out.println(y);
		System.out.println(incrementedY);
		incrementZBy20();
		System.out.println("This is z");
		System.out.println(z);
		incrementZBy20();
		System.out.println("This is z");
		System.out.println(z);
	}
	
	public static void incrementZBy20() {
		z += 20;
	}
	
	public static int incrementBy10(int value) {
//		value = value + 10;
		value += 10;
		return value;
	}
	
}
