package week5;

import java.util.Scanner;

public class LearningIfElseStatement {

	public static void main(String[] args) {
		if(false) {
			System.out.println("This is true");
		} else {
			System.out.println("This is false");
		}

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please input value to check (b) :");
//		int b = scanner.nextInt();
//		System.out.println("Please input the lower range (a) :");
//		int a = scanner.nextInt();
//		System.out.println("Please input the upper range (c) :");
//		int c = scanner.nextInt();
//		if((b >= a) && (b <= c)) {
//			System.out.println("b is between a and c.");
//		} else {
//			System.out.println("b is not between a and c.");
//		}
		
		System.out.println("Input number to check if divisible by 3:");
		int userInput = scanner.nextInt();
		if((userInput % 3) == 0) {
			System.out.println(userInput + " is divisible by 3.");
		} else {
			System.out.println(userInput + " is not divisible by 3, "
					+ "with remainder " + (userInput % 3));
		}
	}
	
}
