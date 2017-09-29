package week11;

public class LearningMatchingString {

	public static void main(String[] args) {
		String message = "IS3204 Programming Application";
		System.out.println(
				message.equals("IS3204 Programming Application"));
		System.out.println(message.equals("Programming"));
		// Using method matches, you can search for
		// string patterns using Regular Expression - regex.
		// Symbol . (dot) represent any character
		// Symbol * (asterisk) represent any number of character
		
		// This will search for the word Programming
		// regardless if there are some text in front or back.
		System.out.println(message.matches(".*Programming.*"));
		// This will search for the word Programming
		// with any one character in front and
		// any number of character at the back.
		System.out.println(message.matches(".Programming.*"));
		// This will search for the word Programming
		// with any seven character in front and
		// any number of character at the back.
		System.out.println(message.matches(".......Programming.*"));
	}
	
}



