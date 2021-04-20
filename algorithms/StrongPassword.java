package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
    	int lengthToAdd = 0;
    	
    	boolean hasDigit = false;
    	boolean hasUpper = false;
    	boolean hasLower = false;
    	boolean hasSpecial = false;
    	
    	int temp;
    	for (int i = 0; i < password.length(); i++) {
    		temp = (int) password.charAt(i);
    		
    		if (temp >= 48 && temp <= 57) {
    			hasDigit = true;
    		} else if (temp >= 65 && temp <= 90) {
    			hasUpper = true;
    		} else if (temp >= 97 && temp <= 122) {
    			hasLower = true;
    		} else if (temp == 33 || (temp >= 35 && temp <= 38) || (temp >= 40 && temp <= 43) || temp == 45 || temp == 64 || temp == 94) {
    			hasSpecial = true;
    		}
    	}
    	
    	if (!hasDigit) {
    		lengthToAdd++;
    	}
    	
    	if (!hasUpper) {
    		lengthToAdd++;
    	}
    	
    	if (!hasLower) {
    		lengthToAdd++;
    	}
    	
    	if (!hasSpecial) {
    		lengthToAdd++;
    	}
    	
    	if (n + lengthToAdd < 6) {
    		lengthToAdd += 6 - n - lengthToAdd;
    	}
    	return lengthToAdd;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);
        System.out.println(answer);

//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
