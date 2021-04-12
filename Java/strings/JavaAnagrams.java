package Java.strings;

import java.util.Scanner;

public class JavaAnagrams {

	public static boolean isAnagram(String a, String b) {
		int[] aArray = new int[26];
		int[] bArray = new int[26];
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if (a.length() != b.length()) {
			return false;
		}
		
		for (int i = 0; i < a.length(); i++) {
			aArray[(int) (a.charAt(i)) - 97]++;
			bArray[(int) (b.charAt(i)) - 97]++;
		}
		
		for (int i = 0; i < aArray.length; i++) {
			if (aArray[i] != bArray[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
