package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheTimeInWords {

	// Complete the timeInWords function below.
	static String timeInWords(int h, int m) {
		String time = "";

		String[] hours = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
		String[] minutes = {" o' clock", "one minute ", "two minutes ", "three minutes ", "four minutes ", "five minutes ", 
				"six minutes ", "seven minutes ", "eight minutes ", "nine minutes ", "ten minutes ", "eleven minutes ", 
				"twelve minutes ", "thirteen minutes ", "fourteen minutes ", "quarter ", "sixteen minutes ", "seventeen minutes ", 
				"eighteen minutes ", "nineteen minutes ", "twenty minutes ", "twenty one minutes ", "twenty two minutes ", 
				"twenty three minutes ", "twenty four minutes ", "twenty five minutes ", "twenty six minutes ", 
				"twenty seven minutes ", "twenty eight minutes ", "twenty nine minutes ", "half "};

		if (m == 0) {
			time = hours[h] + minutes[m];
		} else if (m >= 1 && m <= 30) {
			time = minutes[m] + "past " + hours[h];
		} else if (m >= 31 && m <= 59) {
			time = minutes[60 - m] + "to " + hours[(h + 1) % 12];
		}
		return time;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int h = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int m = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = timeInWords(h, m);
		System.out.println(result);

		//        bufferedWriter.write(result);
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();

		scanner.close();
	}
}
