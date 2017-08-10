package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningNestedIfStatement {

	public static void main(String[] args) {
//		if(true) {
//			System.out.println("This is true");
//			if(true) {
//				System.out.println("This is another true");
//			} else {
//				System.out.println("Now it is false");
//			}
//		} else {
//			System.out.println("This is false");
//		}
		
		// Example
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please choose an option: ");
			System.out.println("(1) List of schools in PB");
			int selectedOption = scanner.nextInt();
			
			if(selectedOption == 1) {
				System.out.println("Please choose an option to");
				System.out.println("list down the lecturers of the school.");
				System.out.println("(1) School of ICT");
				System.out.println("(2) School of Business");
				selectedOption = scanner.nextInt();
				
				if(selectedOption == 1) {
					System.out.println("List of lecturers for SICT");
					System.out.println("-\tJailani");
					System.out.println("-\tBahit");
					System.out.println("-\tAziz");
				} else {
					if(selectedOption == 2) {
						System.out.println("List of lecturers for SBS");
						System.out.println("-\tKhairul");
					} else {
						System.out.println("The option selected is not available.");
					}
				}
				
			} else {
				System.out.println("The option selected is not available.");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid option entered.");
		}
	}
	
}







