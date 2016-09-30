import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void input(String input) {
		File file = new File(input);
		Scanner s;
		try {
			s = new Scanner(file);
			while (s.hasNext()) {
				System.out.println(bin(s.nextInt()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String bin(int num) {
		if (num == 0)
			return "0";
		StringBuffer result = new StringBuffer();
		boolean first = false;
		for (int i = 16; i >= 0; i--) {
			if (Math.pow(2, i) <= num) {
				num = (int) (num - Math.pow(2, i));
				result.append(1);
				first = true;
			} else if (first) {
				result.append(0);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		input(args[0]);
	}

}
