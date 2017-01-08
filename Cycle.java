import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * @version 7/1/2017
 * Solution to DETECTING CYCLES problem from CodeEval
 *
 */
public class Cycle {
	
	/**
	 * Takes in the file and inputs the data into the cycle method.
	 * @param file The input file with 2 digit integers separated by a white space.
	 */
	public static void input(File file) {
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				cycle(in.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Prints out the Cycle within the given string.
	 * @param str The string that represents each individual line from the input file.
	 */
	public static void cycle(String str) {
		HashSet<String> map = new HashSet<>();
		Scanner in = new Scanner(str).useDelimiter("[' ']");

		while (in.hasNext()) {
			String input = in.next();
			if (!map.contains((input)))
				map.add(input);
			else {
				System.out.print(input);

				while (in.hasNext()) {
					String temp = in.next();
					if (temp.equals(input))
						break;
					System.out.print(" " + temp);
				}
				System.out.println();
				break;
			}
		}
	}

	public static void main(String[] args) {
		Cycle.input(new File("/home/dustin/workspace/Project Euler/src/input")); //file path
	}
}
