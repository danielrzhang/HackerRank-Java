package thirtyDaysOfCode;

import java.util.Scanner;

public class LetsReview {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	in.nextLine();
    	
    	String str;
    	for (int i = 0; i < n; i++ ) {
    		str = in.nextLine();
    		
    		String str1 = "";
    		String str2 = "";
    		
    		for (int j = 0; j < str.length(); j++) {
    			if (j % 2 == 0) {
    				str1 += str.charAt(j);
    			} else {
    				str2 += str.charAt(j);
    			}
    		}
    		System.out.println(str1 + " " + str2);
    	}
    	in.close();
    }
}