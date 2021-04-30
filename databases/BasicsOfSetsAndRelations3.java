package databases;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicsOfSetsAndRelations3 {

	public static void main(String[] args) {
		// Answer: 1
		
		ArrayList<Integer> a = new ArrayList<Integer> (Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6}));
		ArrayList<Integer> b = new ArrayList<Integer> (Arrays.asList(new Integer[] {2, 3, 4, 5, 6, 7, 8}));
		
		int counter = 0;
		for (int i = 0; i < a.size(); i++) {
			if (!b.contains(a.get(i))) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
