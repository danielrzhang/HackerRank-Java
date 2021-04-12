package dataStructures;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int n = Integer.parseInt(in.nextLine());

		for (int i = 0; i < n; i++) {
			map.put(in.nextLine(), in.nextInt());
			in.nextLine();
		}

		String name;
		while (in.hasNext()) {
			name = in.nextLine();
			
			if (map.get(name) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(name + "=" + map.get(name));
			}
		}
		in.close();
	}

}
