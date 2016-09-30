import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberPrime {
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int numPrime(int a, int b) {
		int result = 0;
		for (int i = a; i <= b; i++) {
			if (isPrime(i))
				result++;
		}
		return result;
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		//File file = new File("/home/dustin/workspace/Codeeval/src/in");
		try {
			Scanner s = new Scanner(file).useDelimiter(Pattern.compile("[,\n]"));
			while (s.hasNext()) {
				System.out.println(numPrime(Integer.parseInt(s.next()),
						Integer.parseInt(s.next())));
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
