package week4;

public class LearningRelationalOperators {

	public static void main(String[] args) {
		// Greater than
		System.out.println(5 > 2);
		System.out.println(5 > 10);
		System.out.println(5 > 5);
		// Greater than or equal to
		System.out.println(5 >= 2);
		System.out.println(5 >= 10);
		System.out.println(5 >= 5);
		// Less than
		System.out.println(5 < 2);
		System.out.println(5 < 10);
		System.out.println(5 < 5);
		// Less than or equal to
		System.out.println(5 <= 2);
		System.out.println(5 <= 10);
		System.out.println(5 <= 5);
		// Equal to
		System.out.println(5 == 2);
		System.out.println(5 == 10);
		System.out.println(5 == 5);
		// Not equal to
		System.out.println(5 != 2);
		System.out.println(5 != 10);
		System.out.println(5 != 5);
		
		// Examples
		// Example 1
		int a = 10;
		if(a > 10) {
			System.out.println(a + " is greater than 10");
		} else {
			if(a == 10) {
				System.out.println(a + " is equal to 10");
			} else {
				System.out.println(a + " is less than 10");
			}
		}
		
		// Example 2
		while(a < 20) {
			System.out.println(a + " is less than 20");
			a++;
		}
		System.out.println(a + " is equal to 20");
	}
	
}





