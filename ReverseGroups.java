import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * Given a list of numbers and a positive integer k, reverse the elements of the list, k items at a time. 
 * If the number of elements is not a multiple of k, then the remaining items in the end should be left as is.
 *
 */
public class ReverseGroups {

	/**
	 * Flips array values.
	 * @param arr The array being flipped.
	 * @param low The lowest index
	 * @param high The highest index.
	 */
	public static void flip(String[] arr, int low, int high) {
		while (high >= low) {
			String temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	/**
	 * The last value in the array is the size of the array portion being flipped.
	 * @param arr The string array being reversed.
	 * 
	 */
	public static void reverse(String[] arr) {
		int k = Integer.parseInt(arr[arr.length - 1]);

		for (int i = 0; i <= arr.length - (1 + k); i += k) {
			flip(arr, i, (i + k) - 1);
		}
		for (int j = 0; j < arr.length - 1; j++) {
			if (j != arr.length - 2)
				System.out.print(arr[j] + ",");
			else
				System.out.println(arr[j]);
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		try {
			Scanner s = new Scanner(file);
			while (s.hasNext()) {
				reverse(s.nextLine().split("[,;]"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
