package algorithms;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	double positive = 0;
    	double negative = 0;
    	double zero = 0;
    	double total = arr.length;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] > 0) {
    			positive++;
    		} else if (arr[i] < 0) {
    			negative++;
    		} else {
    			zero++;
    		}
    	}
    	System.out.printf("%.6f%n", positive / total);
    	System.out.printf("%.6f%n", negative / total);
    	System.out.printf("%.6f%n", zero/ total);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
