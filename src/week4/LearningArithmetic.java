package week4;

public class LearningArithmetic {

	public static void main(String[] args) {
		// Unary +
		System.out.println(+5);
		// if you want to show the + sign
		System.out.printf("%+d%n", +5);
		// Unary -
		System.out.println(-5);
		System.out.printf("%+d%n", -5);
		// Addition
		System.out.println(5 + 2);
		// Subtraction
		System.out.println(5 - 2);
		// Multiplication
		System.out.println(5 * 2);
		// Division
		// both number is int data type, result will be int. 5/2=2
		System.out.println(5 / 2);
		// both number is double data type, result will be double. 5/2=2.5
		System.out.println((double) 5 / (double) 2);
		// Modulus
		System.out.println(5 % 2);
		System.out.println(100 % 9);
		// Example of modulus
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i + " is an odd number");
			}
		}
		
		System.out.println(3 + 4 * 4 + 5 * (4 + 3) - 1);
		
		// Exponent Operators
		// 2 to the power of 4
		System.out.println(Math.pow(2, 4));
		// 10 to the power of 5
		System.out.println(Math.pow(10, 5));
		// Squareroot 16
		System.out.println(Math.sqrt(100));
		
		// Example: Pythagoras Theorem 
		// First solution
		System.out.println(Math.sqrt(Math.pow(5, 2) + Math.pow(6, 2)));
		// Second solution
		int a = 5;
		int b = 6;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(c);
	}
	
}






