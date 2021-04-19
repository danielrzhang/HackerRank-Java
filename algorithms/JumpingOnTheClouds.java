package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	int currentIndex = 0;
    	
    	while (currentIndex < c.length - 1) {

    		if (currentIndex + 2 < c.length) {
    			if (c[currentIndex + 2] == 0) { 
    				currentIndex += 2;
    			} else {
    				currentIndex++;
    			}
    		} else if (currentIndex + 1 < c.length) {
    			if (c[currentIndex + 1] == 0) {
    				currentIndex++;
    			}
    		}
    		jumps++;
    	}
    	
    	return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
