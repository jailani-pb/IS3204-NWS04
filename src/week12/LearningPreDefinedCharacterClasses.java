package week12;

public class LearningPreDefinedCharacterClasses {

	public static void main(String[] args) {
		String message = "IS3204ProgrammingApplication";
		System.out.println(message);
		// Replace any character to X.
		System.out.println(message.replaceAll(".", "X"));
		// Replace any digit to X.
		System.out.println(message.replaceAll("[0-9]", "X"));
		System.out.println(message.replaceAll("\\d", "X"));
		// Replace any non-digit to X.
		System.out.println(message.replaceAll("[^0-9]", "X"));
		System.out.println(message.replaceAll("\\D", "X"));
		// Replace any word character to X.
		System.out.println(message.replaceAll("[a-zA-Z0-9]", "X"));
		System.out.println(message.replaceAll("\\w", "X"));
		// Replace any non-word character to X.
		System.out.println(message.replaceAll("[^a-zA-Z0-9]", "X"));
		System.out.println(message.replaceAll("\\W", "X"));
		String message2 = "abc-123$&&";
		System.out.println(message2);
		System.out.println(message2.replaceAll("\\W", "X"));
		
		String message3 = "Programming Application";
		System.out.println(message3);
		// Replace any whitespace character to X.
		System.out.println(message3.replaceAll("\\s", "X"));
		// Replace any non-whitespace character to X.
		System.out.println(message3.replaceAll("\\S", "X"));
	}
	
}


