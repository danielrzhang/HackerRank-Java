package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	ArrayList<Integer> unpaired = new ArrayList<Integer>();
    	
    	int pairCounter = 0;
    	boolean notPaired;
    	
    	for (int i = 0; i < ar.length; i++) {
    		notPaired = true;
    		
    		if (unpaired.isEmpty()) {
    			unpaired.add(ar[i]);
    		} else {
    			for (int j = 0; j < unpaired.size(); j++) {
    				if (ar[i] == unpaired.get(j)) {
    					unpaired.remove(j);
    					notPaired = false;
    					pairCounter++;
    					break;
    				}
    			}
    			
    			if (notPaired) {
    				unpaired.add(ar[i]);
    			}
    		}
    	}
    	return pairCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
