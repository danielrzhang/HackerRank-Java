package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendAndDelete {

	// Complete the appendAndDelete function below.
	static String appendAndDelete(String s, String t, int k) {
		int commonLength = 0;

		for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) == t.charAt(i)) {
				commonLength++;
			} else {
				break;
			}
		}
		
		if ((s.length() + t.length() - 2 * commonLength) > k) {
			return "No";
		} else if ((s.length() + t.length() - 2 * commonLength) % 2 == k % 2) {
			return "Yes";
		} else if ((s.length() + t.length() - k) < 0) {
			return "Yes";
		} else {
			return "No";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String t = scanner.nextLine();

		int k = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = appendAndDelete(s, t, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
