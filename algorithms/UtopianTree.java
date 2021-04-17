package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
    	int season = 0;
    	
    	int height = 1;
    	for (int i = 0; i < n; i++) {
    		if (season == 0) {
    			height *= 2;
    		} else {
    			height += 1;
    		}
    		season = 1 - season;
    	}
    	return height;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
