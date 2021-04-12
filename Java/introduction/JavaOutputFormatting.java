package Java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("================================");

        
		for (int i = 0; i < 3; i++) {
			String str = in.next();
			int n = in.nextInt();
			
			System.out.printf("%s%" + (15 - str.length()) + "s%03d\n", str, " ", n);
		}
		
        System.out.println("================================");
        in.close();
	}
}
