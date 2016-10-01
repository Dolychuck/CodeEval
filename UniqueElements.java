import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Dustin Olychuck
 * You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.
 *
 */
public class UniqueElements {
	
	
	/**
	 * @param input String array containing a list of sorted integers, comma delimited, one per line. 
	 */
	public static void unique(String[] input) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < input.length; i++) {
			if (!set.contains(input[i])) {
				set.add(input[i]);
				if (input[i].equals(input[input.length - 1]))
					System.out.println(input[i]);
				else
					System.out.print(input[i] + ",");
			}
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		try {
			Scanner s = new Scanner(file);
			while (s.hasNext()) {
				String[] in = s.nextLine().split(",");
				unique(in);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
