import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
	public static void findDuplicate(String input) {
		String[] in = input.split("[;,\n]");
		boolean[] arr = new boolean[0];
		int N = 0;

		for (int i = 0; i < in.length; i++) {
			if(N == 0) {
				N = Integer.parseInt(in[i]) + 1;
				arr = new boolean[N + 1];
			} else {
				if (arr[Integer.parseInt(in[i])] == true) {
					System.out.println(Integer.parseInt(in[i]));
				} else
					arr[Integer.parseInt(in[i])] = true;
			}
			N--;
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		try {
			findDuplicate(new Scanner(file).useDelimiter("//n").next());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
