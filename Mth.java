import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * CodeEval-Mth To Last Element
 * Write a program which determines the Mth to the last element in a list.
 *  
 *
 */
public class Mth {
	public static void thFromEnd(String str) {
		String[] arr = str.split(" ");
		int ith = Integer.parseInt(arr[arr.length - 1]);
		if(!(ith > arr.length - 1))
				System.out.println(arr[(arr.length - 1) - ith]);
	}

	public static void input(File file) {
		try {
			Scanner s = new Scanner(file);
			while (s.hasNext()) {
				thFromEnd(s.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		input(file);
	}
}
