package java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = new String[n];
		
		for (int i = 0; i < n; i++) {
			s[i] = in.next();
		}
		in.close();

		Comparator<String> customComparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				BigDecimal b1 = new BigDecimal(s1);
				BigDecimal b2 = new BigDecimal(s2);
				
				return b2.compareTo(b1);
			}
		};
		
		Arrays.sort(s, 0, n, customComparator);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}