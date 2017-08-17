package week6;

import java.util.Scanner;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		String userInput = "";
		boolean stillCalculating = true;
		while(stillCalculating) {
			System.out.println("Current Total = " + total);
			System.out.println("Input value to calculate (or quit to stop):");
			userInput = scanner.nextLine();
			if(userInput.toLowerCase().equals("quit")) {
				System.out.println("Application has been terminated.");
				System.out.println("Final Total = " + total);
				stillCalculating = false;
			} else {
				try {
					int convertUserInput = Integer.parseInt(userInput);
					// total = total + convertUserInput
					total += convertUserInput;
				} catch (NumberFormatException e) {
					System.out.println("Input Invalid. Value not calculated to total.");
					e.printStackTrace();
				}
			}
		}
		
		scanner.close();
	}
	
}







