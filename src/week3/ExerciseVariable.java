package week3;

public class ExerciseVariable {

	public static void main(String[] args) {
		float firstStudentMark = 50.159488f;
		float secondStudentMark = 79.1123009f;
		float thirdStudentMark = 40f;
		byte firstStudentAge = 20;
		byte secondStudentAge = 10;
		byte thirdStudentAge = 23;
		
		System.out.printf("The first student aged "
				+ "%d achieved %.2f"
				+ " for this module.%n", firstStudentAge, firstStudentMark);
		
		System.out.printf("%s %d %s %.2f %s%n", "The first student aged",
				firstStudentAge, "achieved", firstStudentMark,
				"for this module.");
		
		System.out.printf("The second student aged "
				+ "%d achieved %.2f"
				+ " for this module.%n", secondStudentAge, secondStudentMark);
		System.out.printf("The third student aged "
				+ "%d achieved %.2f"
				+ " for this module.%n", thirdStudentAge, thirdStudentMark);
		
		String formatString = "The %s student aged "
				+ "%d achieved %.2f"
				+ " for this module.%n";
		System.out.printf(formatString, "first", firstStudentAge, firstStudentMark);
		System.out.printf(formatString, "second", secondStudentAge, secondStudentMark);
		System.out.printf(formatString, "third", thirdStudentAge, thirdStudentMark);
	}
	
}
