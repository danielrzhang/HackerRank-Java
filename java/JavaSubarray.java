package java;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		
		int negativeCounter = 0;
		int counter;
		
		for (int i = 0; i < nums.length; i++) { // Sweep through indices
			counter = 0;
			
			for (int j = i; j < nums.length; j++) {
				counter += nums[j];
				
				if (counter < 0) {
					negativeCounter++;
				}
			}
		}
		
		System.out.println(negativeCounter);
		in.close();
	}

}
