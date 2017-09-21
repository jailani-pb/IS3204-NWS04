package week10;

public class LearningString {

	public static void main(String[] args) {
		// This example is to show interned strings.
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		// If you use == operator, it will compare the 
		// reference of the objects (memory location).
		
		// s1 and s2 reference to different memory location.
		System.out.println("s1 == s2? " + (s1 == s2));
		// s1 and s3 reference to same memory location.
		// s1 and s3 reference to the interned string.
		System.out.println("s1 == s3? " + (s1 == s3));
		// s2 and s3 reference to different memory location.
		System.out.println("s2 == s3? " + (s2 == s3));
	}
	
}





