package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class MarsExploration {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
    	int counter = 0;
    	String expectedString = "";
    	    	
    	for (int i = 0; i < s.length() / 3; i++) {
    		expectedString += "SOS";
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != expectedString.charAt(i)) {
    			counter++;
    		}
    	}
    	
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
