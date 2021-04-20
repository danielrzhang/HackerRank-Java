package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
    	int counter = 1;
    	
    	for (int i = 0; i < s.length(); i++) {
    		if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
    			counter++;
    		}
    	}
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);
        System.out.println(result);
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
