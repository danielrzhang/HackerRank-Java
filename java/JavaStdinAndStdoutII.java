package java;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		double d = in.nextDouble();
		in.nextLine();
		String str = in.nextLine();
		
		System.out.println("String: " + str);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		
		in.close();
	}
}
