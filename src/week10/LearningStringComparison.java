package week10;

public class LearningStringComparison {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "java";
		// Compare the content of the string object.
		System.out.println("s1 equal to s2? " + s1.equals(s2));
		System.out.println("s1 equal to s3? " + s1.equals(s3));
		System.out.println("s2 equal to s3? " + s2.equals(s3));
		// Compare the content of the string object and
		// ignoring its case.
		System.out.println("s1 equals to s3? (ignore case)");
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.toLowerCase().equals(s3.toLowerCase()));
		// Check if the string starts with specific word.
		System.out.println("s1 starts with J");
		System.out.println(s1.startsWith("J"));
		System.out.println("s1 starts with Ja");
		System.out.println(s1.startsWith("Ja"));
		System.out.println("s1 starts with ja");
		System.out.println(s1.startsWith("ja"));
		// Check if the string ends with specific word.
		System.out.println("s1 ends with a");
		System.out.println(s1.endsWith("a"));
		System.out.println("s1 ends with va");
		System.out.println(s1.endsWith("va"));
		System.out.println("s1 ends with VA");
		System.out.println(s1.endsWith("VA"));
	}
	
}



