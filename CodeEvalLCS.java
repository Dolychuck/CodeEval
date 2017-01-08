import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Dustin Olychuck
 * @version 1/06/2017 
 * Longest common sub sequence problem from CodeEval
 *
 */
public class CodeEvalLCS {

	/**
	 * 
	 * @param str1 A string that is being compared to find the LCS.
	 * @param str2 A string that is being compared to find the LCS.
	 * @return The longest common subsequence that exists in both input Strings.
	 * 
	 * A Dynamic programming approach is used to first construct the table and then do a trackback.
	 */
	public static String longestCommonSubsequence(String str1, String str2) {
		int[][] table = new int[str1.length() + 1][str2.length() + 1];

		// construct the Dynamic table
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					table[i + 1][j + 1] = table[i][j]+1;
				}
				else {
					table[i + 1][j + 1] = Math.max(table[i][j + 1], table[i + 1][j]);
				}
			}
		}
		
		//traceback through table to find values
		int i = str1.length();
		int j = str2.length();
		StringBuilder result = new StringBuilder();
		while (i > 0 && j > 0) {
			if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
				result.append(str1.charAt(i - 1));
				i--;
				j--;
			} else {
				if (table[i - 1][j] > table[i][j - 1])
					i--;
				else
					j--;
			}
		}

		return result.reverse().toString();
	}

	public static void input(File file) {
		try {
			Scanner in = new Scanner(file).useDelimiter("[;\n]");
			while(in.hasNext()) {
				String one = in.next();
				String two = in.next();
				System.out.println(longestCommonSubsequence(one,two));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CodeEvalLCS.input(new File("/home/dustin/workspace/Project Euler/src/input"));  //file path
	}
}
