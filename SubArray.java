import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * @version 24/01/2017 Sum of integers from Code eval-
 *          "Write a program to determine the largest sum of contiguous integers in a list."
 */
public class SubArray {

	/**
	 * Prints out the value of the largest consecutive sequence.
	 * 
	 * @param arr
	 *            A string array containing integer values.
	 */
	public static void maxSequence(String[] arr) {
		int max = Integer.MIN_VALUE;
		int current = 0;
		for (int i = 0; i < arr.length; i++) {
			current = current + Integer.parseInt(arr[i]);
			if(current >= max)
				max = current;
			if(current < 0)
				current = 0;
		}
		System.out.println(max);
	}

	/**
	 * Inputs the File line by line into maxSequence.
	 * 
	 * @param file
	 *            A file with integer arrays.
	 */
	public static void input(File file) {
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				maxSequence(sc.next().trim().split(","));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SubArray.input(new File("C:\\Users\\Dustin\\Desktop\\input.txt"));
	}
}