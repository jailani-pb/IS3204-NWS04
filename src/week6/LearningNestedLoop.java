package week6;

public class LearningNestedLoop {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					System.out.print(i + "." + j + "." + k + " ");
					if(k%10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
	
}
