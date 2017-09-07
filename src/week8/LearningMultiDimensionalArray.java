package week8;

public class LearningMultiDimensionalArray {

	public static void main(String[] args) {
		int[][][] cubeArray = {
				{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
				{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
				{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
		};
		
		for(int x = 0; x < cubeArray.length; x++) {
			for(int y = 0; y < cubeArray[x].length; y++) {
				for(int z = 0; z < cubeArray[x][y].length; z++) {
					System.out.println(cubeArray[x][y][z]);
				}
			}
		}
	}
	
}




