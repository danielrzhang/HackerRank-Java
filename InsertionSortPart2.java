package algorithms;

import java.util.Scanner;

public class InsertionSortPart2 {

	// Complete the insertionSort2 function below.
	static void insertionSort2(int n, int[] arr) {
		int temp;
		int index;
		
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			index = i;
			
			while (index >= 1) {
				if (arr[index - 1] > temp) {
					arr[index] = arr[index - 1];
				} else {
					break;
				}
				index--;
			}
			arr[index] = temp;
			
			for (int j = 0; j < arr.length; j++) {
				if (j == arr.length - 1) {
					System.out.print(arr[j] + "\n");
				} else {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		insertionSort2(n, arr);

		scanner.close();
	}
}
