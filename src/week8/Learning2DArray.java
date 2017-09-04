package week8;

public class Learning2DArray {

	public static void main(String[] args) {
		// 1D Array
		// datatype[] variableName = new datatype[size];
		// 2D Array
		// datatype[][] variableName = new datatype[rowSize][columnSize];
		int[][] matrix = new int[3][4];
		
		// Fill the 2D Array
		// Fill in first row
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		// Fill in second row
		matrix[1][0] = 5;
		matrix[1][1] = 6;
		matrix[1][2] = 7;
		matrix[1][3] = 8;
		// Fill in third row
		matrix[2][0] = 9;
		matrix[2][1] = 10;
		matrix[2][2] = 11;
		matrix[2][3] = 12;
		
		// Retrieve row size
		System.out.println(matrix.length);
		// Retrieve column size
		System.out.println(matrix[1].length);
		System.out.println(matrix[0].length);
		System.out.println(matrix[2].length);
		
		// Retrieving all elements in 2D Array and print in table form
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
		
		// Other way to initialise two dimensional array
		int[][] matrix2 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		// Calculate the total sum of all elements
		int total = 0;
		for(int row = 0; row < matrix2.length; row++) {
			for(int column = 0; column < matrix2[row].length; column++) {
				total += matrix2[row][column];
			}
		}
		System.out.println("Total sum of all elements in matrix2:");
		System.out.println(total);
	}
	
}







