import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Trailing String Question from Code eval.
 * @author Dustin Olychuck
 * @version 11/01/2017
 */
public class TrailingString {
	
	/**
	 * Returns 1 if the second string occurs at the end of the first string. Otherwise, return 0.
	 * @param str1 The main String.
	 * @param str2 The String that is being tested to see if it is the end of str1.
	 * @return 0 if the String is not trailing and 1 if it is.
	 */
	public static int isTrailing(String str1, String str2) {
		if (str2.length() > str1.length())
			return 0;
		int j = str1.length() - 1;
		for (int i = str2.length() - 1; i >= 0; i--) {
			if (str1.charAt(j--) != str2.charAt(i))
				return 0;
		}
		return 1;
	}

	/**
	 * Inputs the data from the file to the method.
	 * @param file A file with lines of input.
	 */
	public static void in(File file) {
		try {
			Scanner sc = new Scanner(file).useDelimiter("[',\n']");
			while (sc.hasNext()) {
				System.out.println(isTrailing(sc.next(), sc.next()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TrailingString.in(new File("C:\\Users\\Dustin\\Desktop\\file.txt"));
	}
}
