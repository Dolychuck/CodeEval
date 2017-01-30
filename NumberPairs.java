import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * @version 29/01/2017
 * Sum Pairs problem from CodeEval 
 * https://www.codeeval.com/open_challenges/34/
 */
public class NumberPairs {

	/**
	 * 
	 * @param arr The input array of String represented integers.
	 * @param num The number pairs of values should add up to.
	 */
	public static void sumPairs(String[] arr, int num) {
		int j = 0, i = (arr.length - 1);
		StringBuilder str = new StringBuilder();
		boolean notNull = false;
		while (j < i) {
			if (Integer.parseInt(arr[i]) < num) {
				if ((Integer.parseInt(arr[i]) + Integer.parseInt(arr[j])) > num) {
					i--;
				} else if ((Integer.parseInt(arr[i]) + Integer.parseInt(arr[j])) < num) {
					j++;
				} else {
					if (notNull == true)
						str.append(";");
					str.append(arr[j] + "," + (arr[i]));
					j++;
					i--;
					notNull = true;
				}
			} else {
				i--;
			}
		}
		if (notNull == false) {
			System.out.println("NULL");
		} else {
			System.out.println(str.toString());
		}
	}

	/**
	 * 
	 * @param file A file consisting of comma separated integers with a semicolon delimited Number value at the end.
	 */
	public static void input(File file) {
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String in = sc.nextLine();
				sumPairs(in.substring(0, in.indexOf(";")).split(","),
						Integer.parseInt(in.substring(in.indexOf(";") + 1)));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		input(new File("C:\\Users\\Dustin\\Desktop\\in.txt"));
	}
}
