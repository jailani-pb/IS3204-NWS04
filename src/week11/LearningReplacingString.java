package week11;

public class LearningReplacingString {

	public static void main(String[] args) {
		String message = "is3204 Programming Application";
		// Replace the first instance of a word.
		// word "is"
		String replaceString1 = message.replaceFirst("a", "S");
		System.out.println(replaceString1);
		System.out.println(message);
		// Replace all instances of a word.
	}
	
}
