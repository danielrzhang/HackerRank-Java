package algorithms;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
    	String list = "";
    	
    	String strI, square, strLeft, strRight;
    	long left, right;
    	for (long i = p; i <= q; i++) {
    		strI = Long.toString(i);
    		square = Long.toString(i * i);
    		
    		strLeft = square.substring(0, square.length() - strI.length());
    		strRight = square.substring(square.length() - strI.length());
    		
    		right = Integer.parseInt(strRight);
    		if (strLeft.equals("")) {
    			left = 0;
    		} else {
    			left = Integer.parseInt(strLeft);
    		}
    		
    		if (left + right == i) {
    			list += i + " ";
    		}
    	}
    	list = list.trim();
    	
    	if (list.equals("")) {
    		System.out.println("INVALID RANGE");
    	} else {
    		System.out.println(list);
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
