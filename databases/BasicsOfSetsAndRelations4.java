package databases;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicsOfSetsAndRelations4 {

	public static void main(String[] args) {
		// Answer: 42
		
		ArrayList<Integer> a = new ArrayList<Integer> (Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6}));
		ArrayList<Integer> b = new ArrayList<Integer> (Arrays.asList(new Integer[] {2, 3, 4, 5, 6, 7, 8}));
		
		System.out.println(a.size() * b.size());
	}

}
