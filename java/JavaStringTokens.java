package java;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().trim();
		
		if (str.length() > 0) {
			String[] array = str.split("[ !,.?_\'@]+");
			
			System.out.println(array.length);
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			
		} else {
			System.out.println(0);
			System.out.println("");
		}
		in.close();
	}

}
