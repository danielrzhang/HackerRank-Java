package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class Encryption {
	//if man was meant to stay on the ground god would have given us roots
	
    // Complete the encryption function below.
    static String encryption(String s) {
    	s = s.replaceAll("\\s+", "");
    	int numRows = (int) Math.sqrt(s.length());
    	int numColumns = (int) Math.ceil(Math.sqrt(s.length()));
    	
    	if (numRows * numColumns < s.length()) {
    		numRows++;
    	}
    	    	
    	String[][] array = new String[numRows][numColumns];
    	String newString = "";
    	
    	for (int i = 0; i < numRows; i++) {
    		for (int j = 0; j < numColumns; j++) {
    			if (i * numColumns + j >= s.length()) {
    				break;
    			} else {
    				array[i][j] = Character.toString(s.charAt((i * numColumns) + j));
    			}
    		}
    	}
    	
    	for (int i = 0; i < numColumns; i++) {
    		for (int j = 0; j < numRows; j++) {
    			if (array[j][i] != null) {
    				newString += array[j][i];
    			}
    		}
    		newString += " ";
    	}
    	    	
    	return newString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
