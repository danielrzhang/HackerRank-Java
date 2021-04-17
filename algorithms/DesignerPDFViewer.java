package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
    	int maxValue = 0;
    	
    	int temp;
    	for (int i = 0; i < word.length(); i++) {
    		temp = h[(int) (word.charAt(i)) - 97];
    		if (temp > maxValue) {
    			maxValue = temp;
    		}
    	}
    	return maxValue * word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);
        System.out.println(result);
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
