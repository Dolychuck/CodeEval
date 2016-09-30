import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scrub {
	public static void scrubChar(File file) {
		try {
			Scanner in = new Scanner(file);
			while (in.hasNext()) {
				String temp = in.nextLine();
				StringBuilder str = new StringBuilder();
				boolean[] arr = new boolean[128];
				for (int i = temp.length() - 1; temp.charAt(i) != ','; i--) {
					if (temp.charAt(i) != ' ')
						arr[(int) temp.charAt(i)] = true;
				}
				for (int i = 0; temp.charAt(i) != ','; i++) {
					if (temp.charAt(i) == ' ')
						str.append(temp.charAt(i));
					if (temp.charAt(i) != ' ' && arr[temp.charAt(i)] != true)
						str.append(temp.charAt(i));
				}
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		scrubChar(file);

	}

}
