import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void input(File file) {
		try {
			Scanner s = new Scanner(file);
			while(s.hasNext()) {
				System.out.println(numberOfOnes(s.nextInt()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static int numberOfOnes(int num) {
		int result = 0;
		while(num > 0) {
			if(num % 2 == 1)
				result++;
			num/=2;
		}
		return result;
	}
	public static void main(String[] args) {
		File file = new File(args[0]);
		input(file);
	}
}
