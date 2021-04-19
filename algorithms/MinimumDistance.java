package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class MinimumDistance {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	int minDistance = -1;
    	int currentDistance = 0;
    	
    	for (int i = 0; i < a.length; i++) {
    		currentDistance = 0;
    		
    		for (int j = i + 1; j < a.length; j++) {
    			if (a[i] == a[j]) {
    				currentDistance = Math.abs(j - i);
    				break;
    			}
    		}
    		
    		if ((currentDistance < minDistance || minDistance == -1) && currentDistance != 0) {
    			minDistance = currentDistance;
    		}
    	}
    	return minDistance;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);
        System.out.println(result);
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
