package week4;

public class LearningLogicalOperators {

	public static void main(String[] args) {
		System.out.println("True: " + true);
		System.out.println("False: " + false);
		// NOT
		System.out.println("NOT True: " + !true);
		System.out.println("NOT False: " + !false);
		int a = 5;
		int b = 10;
		System.out.println("a > b : " + (a > b));
		System.out.println("NOT a > b : " + !(a > b));
		// Example:
		while(!(a >= b)) {  // while(a < b) {}
			System.out.println("a is still not greater than or equal to b");
			a++;
		}
		System.out.println("a is now greater than or equal to b");
		System.out.println();
		
		// AND
		System.out.println("True AND True : " + (true && true));
		System.out.println("True AND False : " + (true && false));
		System.out.println("False AND True : " + (false && true));
		System.out.println("False AND False : " + (false && false));
		int c = 5;
		int d = 10;
		int e = 15;
		System.out.println("(d > c) && (c < e) : " + ((d > c) && (c < e)));
		// Example
		if((d > 6) && (d < 25)) {
			System.out.println("d is between 6 and 25");
		} else {
			System.out.println("d is not between 6 and 25");
		}
		System.out.println();
		// OR
		System.out.println("True OR True : " + (true || true));
		System.out.println("True OR False : " + (true || false));
		System.out.println("False OR True : " + (false || true));
		System.out.println("False OR False : " + (false || false));
		int f = 150;
		int g = 40;
		int h = 73;
		System.out.println("(g < f) || (h > f) : " + ((g < f) || (h > f)));
		// Example
		if((f < 60) || (f > 100)) {
			System.out.println("f is less than 60 or more than 100");
		} else {
			System.out.println("f is between 60 and 100");
		}
		System.out.println();
		
		// Combining the logical operators
		System.out.println("((d > c) && (c < e)) && ((g < f) || (h > f))");
		System.out.println(((d > c) && (c < e)) && ((g < f) || (h > f)));
		System.out.println();
		System.out.println("(d > c) || ((g > f) && (h > f))");
		System.out.println((d > c) || ((g > f) && (h > f)));
	}
	
}






