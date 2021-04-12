package java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static Scanner in;
	static int B;
	static int H;
	static boolean flag;

	static {
		in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();

		if (B > 0 && H > 0) {
			flag = true;
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.print(area);
		} 
	}
}
