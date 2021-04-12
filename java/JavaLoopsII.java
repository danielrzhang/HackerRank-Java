package java;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int a, b, x, counter;
		for (int i = 0; i < n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			x = in.nextInt();
			counter = a;
			
			for (int j = 0; j < x; j++) {
				counter += (int) Math.pow(2, j) * b;
				
				if (j == x - 1) {
					System.out.println(counter);
				} else {
					System.out.print(counter + " ");
				}
			}
		}
		in.close();
	}
}
