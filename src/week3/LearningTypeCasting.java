package week3;

public class LearningTypeCasting {

	public static void main(String[] args) {
		// Type casting from small to big data types
		byte exampleByte = 127;
		System.out.println(exampleByte);
		short byteToShort = exampleByte;
		System.out.println(byteToShort);
		int shortToInt = byteToShort;
		System.out.println(shortToInt);
		long intToLong = shortToInt;
		System.out.println(intToLong);
		
		// Type casting from big to small data types
		long exampleLong = 20000000000L; // 20 billion
		System.out.println(exampleLong);
		int longToInt = (int) exampleLong;
		System.out.println(longToInt);
		short intToShort = (short) longToInt;
		System.out.println(intToShort);
		byte shortToByte = (byte) intToShort;
		System.out.println(shortToByte);
	}
	
}







