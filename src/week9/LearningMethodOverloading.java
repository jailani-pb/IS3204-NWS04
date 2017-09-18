package week9;

public class LearningMethodOverloading {

	public static void main(String[] args) {
		System.out.println(incrementBy10(33));
		System.out.println(incrementBy10(99.63));
		System.out.println(incrementBy10(10, 84));
	}
	
	public static int incrementBy10(int value) {
		value += 10;
		return value;
	}
	
	public static int incrementBy10(int x, int y) {
		int value = x + y;
		value += 10;
		return value;
	}
	
	public static double incrementBy10(double value) {
		value += 10.0;
		return value;
	}
	
}
