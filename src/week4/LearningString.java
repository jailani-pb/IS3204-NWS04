package week4;

public class LearningString {

	public static void main(String[] args) {
		// Two ways to initialise String variable
		// Preferred way to initialise
		String name = "Jailani";
		// This is not the preferred way to initialise
		String name2 = new String("Jailani");
		
		// Comparing two strings variable
		// It is not recommended to use == to compare Strings
		// It is much safer to use .equals method
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		System.out.println("Jailani".equals(name));
		
		// Combining multiple strings (Concatenate)
		System.out.println(name + " " + name2 + " " + 123);
		System.out.println(name.concat(" ").concat(name2)
				.concat(" ").concat("" + 123));
		System.out.println(name.concat(" ").concat(name2)
				.concat(" ").concat(Integer.toString(123)));
	}
	
}
