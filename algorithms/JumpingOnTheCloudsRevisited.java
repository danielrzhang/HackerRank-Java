package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c, int k) {
		boolean running = true;

		int energyLevel = 100;
		int currentPosition = 0;

		while (running) {
			currentPosition += k;

			if (currentPosition >= c.length) {
				if (currentPosition == c.length) {
					running = false;
				} 
				currentPosition %= c.length;
			}

			if (c[currentPosition] == 1) {
				energyLevel -= 3;
			} else {
				energyLevel--;
			}
		}
		return energyLevel;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c, k);
		System.out.println(result);

		//        bufferedWriter.write(String.valueOf(result));
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();

		scanner.close();
	}
}
