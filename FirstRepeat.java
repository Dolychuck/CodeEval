import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 *@author Dustin Olychuck
 *@version 23/01/2017
 *First repeating Character solution from CodeEval
 */
public class FirstRepeat {
	
	/**
	 * 
	 * @param str A string being tested for the first occurrence of a repeating character.
	 */
	public static void firstRep(String str) {
		short[] rep = new short[256];
		for (int i = 0; i < str.length(); i++) {
			rep[str.charAt(i) - 97]++;
		}

		for (int j = 0; j < str.length(); j++) {
			if (rep[str.charAt(j) - 97] <= 1) {
				System.out.println(str.charAt(j));
			}
		}
	}

	/**
	 * 
	 * @param file A file containing single lines of words.
	 */
	public static void input(File file) {
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				firstRep(sc.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FirstRepeat.input(new File(args[0])); //File from command line args
	}
}
