package java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger num1 = new BigInteger(in.nextLine());
		BigInteger num2 = new BigInteger(in.nextLine());
		
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
		in.close();
	}

}
