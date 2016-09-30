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
		for(int i = 16; i >= 0; i--) {
			if(Math.pow(2, i) <= num) {
				num = num - (int) Math.pow(2, i); 
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		File file = new File(args[0]);
		input(file);
	}
}
