package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningBasicIfStatement {

	public static void main(String[] args) {
		if(true) {
			System.out.println("This is true");
		}
		if(false) {
			System.out.println("This is false");
		}
		if(true && false) {
			System.out.println("This is true and false");
		}
		if(true || false) {
			System.out.println("This is true or false");
		}
		
		int a = 5;
		int b = 10;
		int c = 15;
		if((b >= a) && (b <= c)) {
			System.out.println("b is between a and c.");
		}
		
//		try {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Please input a number:");
//			int userInput = scanner.nextInt();
//			if(userInput > 100) {
//				System.out.println("The number you input is more than 100");
//			}
//		} catch (InputMismatchException e) {
//			System.out.println("You have inputted invalid data.");
//		}
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please input a number: ");
			String userInput = scanner.nextLine();
			int userInputToInt = Integer.parseInt(userInput);
			if(userInputToInt > 100) {
				System.out.println("It is more than 100");
			}
		} catch (NumberFormatException e) {
			System.out.println("Wrong input data.");
		}
	}
	
}






