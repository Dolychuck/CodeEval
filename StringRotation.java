import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * @verson 20/01/2017
 *String Rotation problem from CodeEval
 */
public class StringRotation {
	/**
	 * Test to see if one string is a rotation of the other eg. Hello and lloHe
	 * @param str1 The original String.
	 * @param str2 The rotated String
	 */
	public static void isRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("False");
			return;
		}
		String test = new String(str2 + str2);
		System.out.println(test.contains(str1) ? "True" : "False");
	}

	/**
	 * 
	 * @param file A file contain the two words separated by a comma.
	 */
	public static void in(File file) {
		try {
			Scanner sc = new Scanner(file).useDelimiter("[',\n']");
			while (sc.hasNext()) {
				isRotation(sc.next(), sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StringRotation.in(new File(args[0]));
	}
}
