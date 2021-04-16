package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);

    	long smallCounter = 0;
    	long largeCounter = 0;
    	
    	for (int i = 0; i < arr.length - 1; i++) {
    		smallCounter += arr[i];
    	}
    	
    	for (int i = arr.length - 1; i >= 1; i--) {
    		largeCounter += arr[i];
    	}
    	
    	System.out.println(smallCounter + " " + largeCounter);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
