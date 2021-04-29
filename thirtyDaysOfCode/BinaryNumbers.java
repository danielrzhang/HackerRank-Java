package thirtyDaysOfCode;

import java.util.Scanner;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String binary = Integer.toBinaryString(n);
        
        int maxCounter = 0;
        
        String contains = "1";
        while (true) {
        	if (binary.contains(contains)) {
        		maxCounter++;
        		contains += "1";
        	} else {
        		break;
        	}
        }
        System.out.println(maxCounter);

        scanner.close();
    }
}
