package week3;

public class LearningIncrementDecrement {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(x);
//		x = x + 1;
		x++;
		System.out.println(x);
//		x = x - 1;
		x--;
		System.out.println(x);
		// Example usage of increment
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		// Example usage of decrement
		for(int i = 10; i > 0; i--) {
			System.out.println("i = " + i);
		}
		
		// Pre-increment
		int y = 5;
		System.out.println("y = " + (++y));
		System.out.println("y = " + (y));
		// Post-increment
		int z = 5;
		System.out.println("z = " + (z++));
		System.out.println("z = " + (z));
		// Pre-decrement
		int a = 5;
		System.out.println("a = " + (--a));
		System.out.println("a = " + (a));
		// Post-decrement
		int b = 5;
		System.out.println("b = " + (b--));
		System.out.println("b = " + (b));
	}
	
}





