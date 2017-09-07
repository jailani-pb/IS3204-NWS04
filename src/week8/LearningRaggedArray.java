package week8;

public class LearningRaggedArray {

	public static void main(String[] args) {
		// Initialise the number of rows
		int[][] triangleArray = new int[3][];
		// Initialise the number of columns for each rows
		triangleArray[0] = new int[3];
		triangleArray[1] = new int[2];
		triangleArray[2] = new int[1];
		// Fill in data to ragged array
		triangleArray[0][0] = 1;
		triangleArray[0][1] = 2;
		triangleArray[0][2] = 3;
		triangleArray[1][0] = 4;
		triangleArray[1][1] = 5;
		triangleArray[2][0] = 6;
		// Retrieve all data (elements) from ragged array.
		for(int row = 0; row < triangleArray.length; row++) {
			for(int column = 0; column < triangleArray[row].length; column++) {
				System.out.print(triangleArray[row][column] + "\t");
			}
			System.out.println();
		}
		// Initialise ragged array with data.
		int[][] triangleArray2 = {
				{1, 2, 3},
				{4, 5},
				{6}
		};
	}
	
}








