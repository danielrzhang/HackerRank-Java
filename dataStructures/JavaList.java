package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		
		int m = in.nextInt();
		
		String command;
		int x, y;
		for (int i = 0; i < m; i++) {
			in.nextLine();
			
			command = in.nextLine();
			if (command.equals("Insert")) {
				x = in.nextInt();
				y = in.nextInt();
				
				list.add(x, y);
			} else {
				x = in.nextInt();
				
				list.remove(x);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		in.close();
	}

}
