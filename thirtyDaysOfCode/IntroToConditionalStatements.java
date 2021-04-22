package thirtyDaysOfCode;

import java.util.Scanner;

public class IntroToConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = "";
        if (n % 2 == 1) {
        	result = "Weird";
        } else {
        	if (n >= 2 && n <= 5) {
        		result = "Not Weird";
        	} else if (n >= 6 && n <= 20) {
        		result = "Weird";
        	} else {
        		result = "Not Weird";
        	}
        }
        System.out.println(result);
        scanner.close();
    }
}
