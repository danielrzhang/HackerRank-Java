package databases;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicsOfSetsAndRelations1 {

	public static void main(String[] args) {
		// Answer: 8
		
		ArrayList<Integer> a = new ArrayList<Integer> (Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6}));
		ArrayList<Integer> b = new ArrayList<Integer> (Arrays.asList(new Integer[] {2, 3, 4, 5, 6, 7, 8}));

		for (int i = 0; i < a.size(); i++) {
			if (!b.contains(a.get(i))) {
				b.add(a.get(i));
			}
		}
		
		System.out.println(b);
		System.out.println(b.size());
	}

}
