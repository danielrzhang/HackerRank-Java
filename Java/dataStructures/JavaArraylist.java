package Java.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		ArrayList<Integer>[] arrayOfLists = new ArrayList[n];
		
		ArrayList<Integer> nums;
		int numOfNums;
		for (int i = 0; i < n; i++) {
			nums = new ArrayList<Integer>();
			
			numOfNums = in.nextInt();
			
			for (int j = 0; j < numOfNums; j++) {
				nums.add(in.nextInt());
			}
			
			arrayOfLists[i] = nums;
		}
		
		int m = in.nextInt();
		int y, x;
		for (int i = 0; i < m; i++) {
			x = in.nextInt();
			y = in.nextInt();
			
			try {
				System.out.println(arrayOfLists[x - 1].get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		in.close();
	}

}
