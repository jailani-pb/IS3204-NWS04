package week5;

import java.util.Scanner;

public class LearningConditionalOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int powerValue = scanner.nextInt();
		// This is a simple if else statement
		if((powerValue >= 1) && (powerValue <= 10)) {
			System.out.println(Math.pow(5, powerValue));
		} else {
			System.out.println("That power value is not allowed");
		}
		
		System.out.println(
				((powerValue >= 1) && (powerValue <= 10)) ?
						Math.pow(5, powerValue) : "That power value is not allowed"
				);
		
		String output = ((powerValue >= 1) && (powerValue <= 10)) ?
				Double.toString(Math.pow(5, powerValue)) : 
					"That power value is not allowed";
		System.out.println(output);
	}
	
}







