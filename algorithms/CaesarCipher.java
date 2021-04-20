package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
    	String newString = "";
    	
    	int currentLetter;
    	for (int i = 0; i < s.length(); i++) {
    		currentLetter = (int) s.charAt(i);
    		
    		if (currentLetter >= 65 && currentLetter <= 90) {
    			currentLetter = 65 + ((currentLetter - 65) + k) % 26;
    			newString += Character.toString((char) currentLetter);
    		} else if (currentLetter >= 97 && currentLetter <= 122) {
    			currentLetter = 97 + ((currentLetter - 97) + k) % 26;
    			newString += Character.toString((char) currentLetter);
    		} else {
    			newString += Character.toString(s.charAt(i));
    		}
    	}
    	return newString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);
        System.out.println(result);
        
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
