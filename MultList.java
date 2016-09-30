import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MultList {
	public static void multList(String input) {
		File file = new File(input);
		try {
			Scanner s = new Scanner(file).useDelimiter(Pattern.compile("[\n]"));
			while (s.hasNext()) {
				String[] temp = s.next().split(" ");
				for (int i = 0; i < temp.length / 2; i++) {
					System.out.print(Integer.parseInt(temp[i])
							* Integer.parseInt(temp[i + (1 + temp.length / 2)])
							+ " ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		multList(args[0]);
	}

}
