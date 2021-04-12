package Java.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	private static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		String n = in.nextLine();
		in.close();
		
		BigInteger b = new BigInteger(n);
		
		if (b.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
