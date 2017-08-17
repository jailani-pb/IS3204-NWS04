package week6;

public class LearningWhileLoop {

	public static void main(String[] args) {
		int a = 1;
		while(a <= 10) {
			System.out.println(a + ": Welcome to Java");
			a++;
		}
		
		int b = 1;
		boolean isContinue = true;
		while(isContinue) {
			System.out.println(b + ": Programming Application");
			b++;
			if(b > 10) {
				isContinue = false;
			}
		}
	}
	
}





