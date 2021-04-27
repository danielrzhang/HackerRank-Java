package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class Pangrams {

	// Complete the pangrams function below.
	static String pangrams(String s) {
		int counter = 0;
		s = s.toUpperCase();
		boolean[] array = new boolean[26];

		int ch;
		for (int i = 0; i < s.length(); i++) {
			ch = (int) s.charAt(i);

			if (ch >= 65 && ch <= 90) {
				if (!array[ch - 65]) {
					array[ch - 65] = true;
					counter++;
				}
			}
		}

		if (counter == 26) {
			return "pangram";
		} else {
			return "not pangram";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = pangrams(s);
		System.out.println(result);

		//        bufferedWriter.write(result);
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();

		scanner.close();
	}
}
