package java;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		String b = in.nextLine();
		
		System.out.println(a.length() + b.length());
		
		if (a.compareTo(b) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(a.toUpperCase().charAt(0) + a.substring(1) + " " + b.toUpperCase().charAt(0) + b.substring(1));
		in.close();
	}

}
