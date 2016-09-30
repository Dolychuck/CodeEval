/**
 * @author Dustin Olychuck
 * Print out the table in a matrix like fashion, each number formatted to a
 * width of 4 (The numbers are right-aligned and strip out leading/trailing 
 * spaces on each line).
 */
public class MultiplicationTable {
	public static void mult() {
		int[][] table = new int[12][12];

		for (int i = 0; i < 12; i++) {
			System.out.println();
			for (int j = 0; j < 12; j++) {
				table[i][j] = (i + 1) * (j + 1);
				if((i + 1) * (j + 2) < 10)
					System.out.print(table[i][j] + "   ");
				else if((i + 1) * (j + 2) < 100)
					System.out.print(table[i][j] + "  ");
				else 
					System.out.print(table[i][j] + " ");

			}
		}
	}

	public static void main(String[] args) {
		mult();

	}

}
