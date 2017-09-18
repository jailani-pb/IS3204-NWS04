package week9;

public class LearningMethods {

	public static void main(String[] args) {
//		int sum = sumRangeNumber(1, 10);
//		System.out.println("Sum from 1 to 10 is " + sum);
//		sum = sumRangeNumber(20, 37);
//		System.out.println("Sum from 20 to 37 is " + sum);
//		sum = sumRangeNumber(35, 49);
//		System.out.println("Sum from 35 to 49 is " + sum);
//		System.out.println("Sum from 1 to 10 is " + sumRangeNumber(1, 10));
//		System.out.println("Sum from 20 to 37 is " + sumRangeNumber(20, 37));
//		System.out.println("Sum from 35 to 49 is " + sumRangeNumber(35, 49));
		System.out.println(textSumRangeNumber(1, 10));
		System.out.println(textSumRangeNumber(20, 37));
		System.out.println(textSumRangeNumber(35, 49));
	}
	
	public static String textSumRangeNumber(int lowerNumber, int upperNumber) {
		String text = "Sum from " + lowerNumber + " to " + upperNumber
				+ " is " + sumRangeNumber(lowerNumber, upperNumber);
		return text;
	}
	
	public static int sumRangeNumber(int lowerNumber, int upperNumber) {
		int sum = 0;
		for(int i = lowerNumber; i <= upperNumber; i++) {
			sum += i;
		}
		return sum;
	}
	
}
