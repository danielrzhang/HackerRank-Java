package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class RunningTimeOfAlgorithms {

    // Complete the runningTime function below.
    static int runningTime(int[] arr) {
    	int temp;
		int index;
		int counter = 0;
		
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			index = i;
			
			while (index >= 1) {
				if (arr[index - 1] > temp) {
					arr[index] = arr[index - 1];
					counter++;
				} else {
					break;
				}
				index--;
			}
			arr[index] = temp;
		}
		return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
