package java;

import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String str, int num) {	
		String smallest = "";
		String largest = "";
		
		String temp;
		smallest = str.substring(0, num);
		
		for (int i = 0; i < str.length() - num + 1; i++) {
			temp = str.substring(i, i + num);
			
			if (temp.compareTo(smallest) < 0) {
				smallest = temp;
			}
			
			if (temp.compareTo(largest) > 0) {
				largest = temp;
			}
		}
		return smallest + "\n" + largest;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		String str = in.nextLine();
		int num = in.nextInt();
		in.close();
		
		System.out.println(getSmallestAndLargest(str, num));
	}

}
