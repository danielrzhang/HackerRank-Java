package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(BigInteger n) {
		BigInteger one = new BigInteger("1");
    	BigInteger total = one;

    	while (n.compareTo(one) >= 0) {
    		total = total.multiply(n);
    		n = n.subtract(one);
    	}
		System.out.println(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = new BigInteger(scanner.nextLine());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
