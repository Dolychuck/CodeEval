import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LongLines {
	public static Comparator<String> COMP = new Comparator<String>() {
		public int compare(String o1, String o2) {
			if(o1.equals(02))
				return 0;
			else if(o1.length() < o2.length())
				return 1;
			else 
				return -1;
		}
		
	};
	public static void longLines(File file) {
		PriorityQueue<String> pq = new PriorityQueue<>(COMP);
		try {
			Scanner in = new Scanner(file);
			int n = in.nextInt();
			while(in.hasNextLine()) {
				String temp = in.nextLine();
				pq.add(temp);
				//System.out.println(temp);
			}
			for(int i = 0; i < n; i++) {
				System.out.println(pq.remove());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		LongLines.longLines(new File("/home/dustin/workspace/Project Euler/src/input"));
	}

}
