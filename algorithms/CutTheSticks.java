package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
    	ArrayList<Integer> sticks = new ArrayList<Integer>();
    	ArrayList<Integer> stickCutTimes = new ArrayList<Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		sticks.add(arr[i]);
    	}
    	
    	boolean running = true;
    	
    	int sticksCut, cutLength;
    	
    	while (running) {
    		sticksCut = 0;
    		cutLength = Collections.min(sticks);
    		
    		for (int i = 0; i < sticks.size(); i++) {
    			sticks.set(i, sticks.get(i) - cutLength);
    			sticksCut++;

    			if (sticks.get(i) == 0) {
    				sticks.remove(i);
    				i--;
    			}
    		}
    		
			stickCutTimes.add(sticksCut);
        	if (sticks.isEmpty()) {
    			running = false;
    		}
    	}
    	int[] array = new int[stickCutTimes.size()];
    	
    	for (int i = 0; i < stickCutTimes.size(); i++) {
    		array[i] = stickCutTimes.get(i);
    	}
    	return array;
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

        int[] result = cutTheSticks(arr);
        System.out.println(Arrays.toString(result));
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
