package algorithms;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class EqualizeTheArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> modeCounter = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (modeCounter.containsKey(arr[i])) {
                modeCounter.put(arr[i], modeCounter.get(arr[i]) + 1);
            } else {
                modeCounter.put(arr[i], 1);
            }
        }
        
        int mostFrequent = Collections.max(modeCounter.values());
        int mostFrequentValue = 0;
        
        for (Entry<Integer, Integer> entry : modeCounter.entrySet()) { 
            if (entry.getValue() == mostFrequent) {
                mostFrequentValue = entry.getKey(); 
            }
        }
        
        int removeCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != mostFrequentValue) {
                removeCounter++;
            }
        }
        return removeCounter;
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

        int result = equalizeArray(arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
