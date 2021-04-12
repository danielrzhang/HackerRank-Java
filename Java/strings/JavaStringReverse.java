package Java.strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String checkStr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			checkStr += Character.toString(str.charAt(i));
		}
		
		if (checkStr.equals(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}

}
