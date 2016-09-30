import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fizz {
	public static void fizzBuzz(File f) {
		try {
			Scanner in = new Scanner(f);
			for (int i = 1; i <= 20; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				int N = in.nextInt();
				for (int j = 1; j <= N; j++) {
					if (j % x == 0 && j % y == 0)
						System.out.print("FB");
					else if (j % x == 0)
						System.out.print("F");
					else if (j % y == 0)
						System.out.print("B");
					else
						System.out.print(j);
					if (j != N)
						System.out.print(" ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		fizzBuzz(file);
	}
}
