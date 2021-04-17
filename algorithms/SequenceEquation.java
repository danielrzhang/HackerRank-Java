package algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
    	int index1;
    	int index2;
    	int[] array = new int[p.length];
    	
    	for (int i = 1; i <= p.length; i++) {
    		index1 = 0;
    		index2 = 0;
    		
    		for (int j = 0; j < p.length; j++) {
    			if (p[j] == i) {
    				index1 = j + 1;
        			break;
    			}
    		}
    		
    		for (int j = 0; j < p.length; j++) {
    			if (p[j] == index1) {
    				index2 = j + 1;
    				break;
    			}
    		}
    		array[i - 1] = index2;
    	}
    	return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);
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
