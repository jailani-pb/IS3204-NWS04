package week6;

import java.util.Scanner;

public class LearningForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input value:");
		int userInput = scanner.nextInt();
		// for(initial-action; loop-continuation-condition; action-after-each-iteration){}
		for(int a = 0; a < userInput; a++) {
			System.out.println(a + ": Welcome to Java");
		}
		
		int b;
		for(b = 0; b < userInput; b++) {
			System.out.println(b + ": Programming Application");
		}

		System.out.println(b);
		
		scanner.close();
	}
	
}




