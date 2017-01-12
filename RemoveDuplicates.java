import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * WITHOUT REPETITIONS Question from Code eval
 * @author Dustin Olychuck
 * @version 11/01/2017
 */
public class RemoveDuplicates {
	
	/**
	 * Removes any sequential repeating characters.
	 * @param str An input String.
	 */
	public static void remove(String str) {
		if (str.length() > 0)
			System.out.print(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) != str.charAt(i)) {
				System.out.print(str.charAt(i));
			}
		}
	}

	/**
	 * 
	 * @param file A file with lines of input.
	 */
	public static void in(File file) {
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				remove(sc.nextLine());
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		RemoveDuplicates.in(new File("C:\\Users\\Dustin\\Desktop\\file.txt"));
	}

}
