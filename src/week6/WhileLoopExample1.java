package week6;

import java.util.Scanner;

public class WhileLoopExample1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = "";
		while(!message.toLowerCase().equals("quit")) {
			System.out.println("Please input a message (or quit to stop): ");
			message = scanner.nextLine();
			if(message.toLowerCase().equals("quit")) {
				System.out.println("Application has been terminated.");
			} else {
				System.out.println("Message: " + message);
			}
		}
		
		
		scanner.close();
	}
	
}
