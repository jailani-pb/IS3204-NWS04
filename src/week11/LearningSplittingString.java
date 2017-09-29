package week11;

import java.util.Scanner;

public class LearningSplittingString {

	public static void main(String[] args) {
		String message = "IS3204 Programming Application";
		String[] splitMessages = message.split(" ");
		System.out.println(message);
		for(String m : splitMessages) {
			System.out.println(m);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("List down emails separated by semicolon");
		String userInput = scanner.nextLine();
		while(true) {
			// Expected input:
			// abc@gmail.com; def@hotmail.com
			String[] splitInput = userInput.split(";");
			boolean isValidEmails = true;
			for(String input : splitInput) {
				// Invalid if email does not have @
				if(input.trim().indexOf("@") == -1) {
					System.out.println(input + " is not valid.");
					isValidEmails = false;
				} else {
					// Invalid if email have more than 1 @
					// Eg. ab@cd@gmail.com
					if(input.trim().indexOf("@") != 
							input.trim().lastIndexOf("@")) {
						System.out.println(input + " is not valid.");
						isValidEmails = false;
					} else {
						// Remove spaces eg. ab cd@gmail.com
						input = input.trim().replace(" ", "");
						System.out.println(input);
					}
				}
			}
			
			if(isValidEmails) {
				System.out.println("All emails are valid.");
				break;
			} else {
				System.out.println("Some emails are invalid.");
				System.out.println("List down emails separated by semicolon");
				userInput = scanner.nextLine();
			}
			
		}
		
		scanner.close();
	}
	
}











