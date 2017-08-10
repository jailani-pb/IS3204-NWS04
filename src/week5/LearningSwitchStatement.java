package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningSwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input day number");
		int dayNumber = scanner.nextInt();
//		if(dayNumber == 1) {
//			System.out.println("Monday");
//		} else if (dayNumber == 2) {
//			System.out.println("Tuesday");
//		} else if (dayNumber == 3) {
//			System.out.println("Wednesday");
//		} else if (dayNumber == 4) {
//			System.out.println("Thursday");
//		} else if (dayNumber == 5) {
//			System.out.println("Friday");
//		} else if (dayNumber == 6) {
//			System.out.println("Saturday");
//		} else if (dayNumber == 7) {
//			System.out.println("Sunday");
//		} else {
//			System.out.println("That day number does not exist.");
//		}
		
		switch(dayNumber) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("That day number does not exists."); break;
		}
		
		// Exercise 1
		try {
			System.out.println("Please input month number");
			int monthNumber = scanner.nextInt();
			switch(monthNumber) {
				case 1: System.out.println("January"); break;
				case 2: System.out.println("February"); break;
				case 3: System.out.println("March"); break;
				case 4: System.out.println("April"); break;
				case 5: System.out.println("May"); break;
				case 6: System.out.println("June"); break;
				case 7: System.out.println("July"); break;
				case 8: System.out.println("August"); break;
				case 9: System.out.println("September"); break;
				case 10: System.out.println("October"); break;
				case 11: System.out.println("November"); break;
				case 12: System.out.println("December"); break;
				default: System.out.println("That month number does not exists."); break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		
		//Exercise 2
		try {
			System.out.println("Please input power value number");
			int powerValue = scanner.nextInt();
			// For this scenario, this is not the recommended implementation
			switch(powerValue) {
				case 1: System.out.println(Math.pow(5, 1)); break;
				case 2: System.out.println(Math.pow(5, 2)); break;
				case 3: System.out.println(Math.pow(5, 3)); break;
				case 4: System.out.println(Math.pow(5, 4)); break;
				case 5: System.out.println(Math.pow(5, 5)); break;
				case 6: System.out.println(Math.pow(5, 6)); break;
				case 7: System.out.println(Math.pow(5, 7)); break;
				case 8: System.out.println(Math.pow(5, 8)); break;
				case 9: System.out.println(Math.pow(5, 9)); break;
				case 10: System.out.println(Math.pow(5, 10)); break;
				default: System.out.println("That power value is not allowed"); break;
			}
			// This is much more better in term of scalability.
			if((powerValue >= 1) && (powerValue <= 10)) {
				System.out.println(Math.pow(5, powerValue));
			} else {
				System.out.println("That power value is not allowed");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}
	}
	
}








