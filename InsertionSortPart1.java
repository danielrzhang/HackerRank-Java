package algorithms;

import java.util.Scanner;

public class InsertionSortPart1 {

	// Complete the insertionSort1 function below.
	static void insertionSort1(int n, int[] arr) {
		int temp = arr[arr.length - 1];
		boolean placed = false;
		
		for (int i = arr.length - 2; i >= -1; i--) {
			if (i == -1) {
				arr[i + 1] = temp;
			} else {
				if (temp < arr[i]) {
					arr[i + 1] = arr[i];
				} else {
					arr[i + 1] = temp;
					placed = true;
				}
			}
			
			for (int j = 0; j < arr.length; j++) {
				if (j == arr.length - 1) {
					System.out.print(arr[j] + "\n");
				} else {
					System.out.print(arr[j] + " ");
				}
			}

			if (placed) {
				break;
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

		insertionSort1(n, arr);

		scanner.close();
	}
}
