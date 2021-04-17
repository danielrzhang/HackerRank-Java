package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
    	int counter = 5;
    	int numLiked;
    	int cumulative = 0;
    	
    	for (int i = 0; i < n; i++) {
    		numLiked = counter / 2;
    		cumulative += numLiked;
    		counter = numLiked * 3;
    	}
    	return cumulative;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
