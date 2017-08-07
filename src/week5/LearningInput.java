package week5;

import java.util.Scanner;

public class LearningInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Please type a message:");
//		String message = scanner.nextLine();
//		System.out.println("Message typed -> " + message);
//		System.out.println("Please type another message:");
//		message = scanner.nextLine();
//		System.out.println("The other message typed -> " + message);
		
		System.out.println("Please type a message:");
		String message = scanner.next();
		System.out.println("Message typed -> " + message);
		System.out.println("Please type another message:");
		message = scanner.next();
		System.out.println("The other message typed -> " + message);
		
	}
	
}
