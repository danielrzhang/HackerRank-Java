package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulTriplets {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
    	int counter = 0;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		list.add(arr[i]);
    	}
    	
    	for (int i = 0; i < list.size(); i++) {
    		if (list.contains(list.get(i) + d) && list.contains(list.get(i) + 2 * d)) {
    			counter++;
    		}
    	}
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
