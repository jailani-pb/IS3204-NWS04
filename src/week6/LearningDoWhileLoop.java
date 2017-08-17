package week6;

public class LearningDoWhileLoop {

	public static void main(String[] args) {
		int a = 100;
		do {
			System.out.println(a + ": I am a do-while loop.");
			a++;
		} while (a <= 10);
		
		// To see the difference between while and do-while loop.
		int b = 100;
		while(b <= 10) {
			System.out.println(b + ": I am a while loop.");
			b++;
		}
	}
	
}
