package algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ServiceLane {

    // Complete the serviceLane function below.
    static int[] serviceLane(int[] width, int[][] cases) {
    	
    	int[] array = new int[cases.length];
    	
    	int minWidth, startIndex, endIndex;
    	for (int i = 0; i < cases.length; i++) {
    		minWidth = Integer.MAX_VALUE;
    		startIndex = cases[i][0];
    		endIndex = cases[i][1];
    		for (int j = startIndex; j <= endIndex; j++) {
    			if (minWidth > width[j]) {
    				minWidth = width[j];
    			}
    		}
    		array[i] = minWidth;
    	}
    	return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(width, cases);
        System.out.println(Arrays.toString(result));
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
