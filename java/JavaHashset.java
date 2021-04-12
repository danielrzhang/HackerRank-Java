package java;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
               
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> hashSet = new HashSet<String>();
        String combinedName;
        for (int i = 0; i < t; i++) {
        	combinedName = pair_left[i] + " " + pair_right[i];
        	hashSet.add(combinedName);
        	System.out.println(hashSet.size());
        }
        s.close();
	}

}
