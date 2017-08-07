package week3;

public class LearningDataTypes {

	public static void main(String[] args) {
		// Numeric data type
		byte exampleByte = 127;
		System.out.println(exampleByte);
		// Simulate overflow
		byte addByteBy1 = (byte) (exampleByte + 1);
		System.out.println(addByteBy1);
		short exampleShort = 14000;
		System.out.println(exampleShort);
		int exampleInt = 2147483647;
		System.out.println(exampleInt);
		long exampleLong = 9223372036854775807L;
		System.out.println(exampleLong);
		
		// Floating number data types (numbers with decimal)
		float exampleFloat = 3.12345678901234567890F;
		System.out.println(exampleFloat);
		double exampleDouble = 3.12345678901234567890;
		System.out.println(exampleDouble);
		// Computer store decimal numbers differently.
		// Expected result: 0.3
		// Actual result: 0.30000000000000004
		System.out.println(0.1 + 0.2);
		
		// char datatype
		char exampleChar = 'J';
		System.out.println(exampleChar);
		exampleChar = (char) (exampleChar + 1);
		System.out.println(exampleChar);
		
		// boolean data type
		boolean exampleBoolean = true;
		System.out.println(exampleBoolean);
	}
	
}





