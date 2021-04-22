package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunnyString {

    // Complete the funnyString function below.
    static String funnyString(String s) {
    	String newString = "";
    	
    	ArrayList<Integer> sDiff = new ArrayList<Integer>();
    	ArrayList<Integer> newSDiff = new ArrayList<Integer>();
    	
    	for (int i = s.length() - 1; i >= 0; i--) {
    		newString += Character.toString(s.charAt(i));
    	}
    	
    	for (int i = 0; i < s.length() - 1; i++) {
    		sDiff.add(Math.abs(s.charAt(i) - s.charAt(i + 1)));
    		newSDiff.add(Math.abs(newString.charAt(i) - newString.charAt(i + 1)));
    	}
    	
    	if (sDiff.equals(newSDiff)) {
    		return "Funny";
    	} else {
    		return "Not Funny";
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);
            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
