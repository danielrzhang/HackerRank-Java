package introduction;

import java.util.Scanner;

public class JavaEndofFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 1;
		
		while (in.hasNext()) {
			System.out.println(counter + " " + in.nextLine());
			counter++;
		}
		in.close();
	}

}
