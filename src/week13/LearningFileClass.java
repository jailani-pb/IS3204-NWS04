package week13;

import java.io.File;
import java.util.Date;

public class LearningFileClass {

	public static void main(String[] args) {
		// For windows
		// "C:\\Users\\PC-NAME\\Desktop\\FILENAME"
		File file = new File("/home/jailanihar/abcde.txt");
		System.out.println("Does it exists? " + file.exists());
		System.out.println("Is it a Directory? " + file.isDirectory());
		System.out.println("Is it a File? " + file.isFile());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		// Make sure you import java.util for the Date
		System.out.println("Last modified on " + 
				new Date(file.lastModified()));
		System.out.println("File name is " + file.getName());
		// For the next statements, please make sure you are
		// reading file that is not important.
//		File file2 = new File("/home/jailanihar/abcde.txt");
//		file.renameTo(file2);
//		file.delete();
	}
	
}




