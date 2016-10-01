import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CodeEval CALCULATE DISTANCE.
 * @author Dustin Olychuck
 * You have coordinates of 2 points and need to find the distance between them.
 *
 */
public class Distance {
	
	/**
	 * 
	 * @param arr String array with (x,y) coordinates.
	 * @return Distance between the coordinates.
	 */
	public static int distance(String[] arr) {
		int x1 = Integer.parseInt(arr[0]);
		int x2 = Integer.parseInt(arr[2]);
		int y1 = Integer.parseInt(arr[1]);
		int y2 = Integer.parseInt(arr[3]);
		return  (int) Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
	}
	
	public static void main(String[] args) {
		File file = new File(args[0]);
		try {
			Scanner s = new Scanner(file);
			while(s.hasNext()) {
				String[] str = s.nextLine().replaceAll("[(\\s]","").split("[)(,]");
				System.out.println(distance(str));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
