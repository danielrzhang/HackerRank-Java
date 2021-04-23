package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CavityMap {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
    	int currentInt, topInt, bottomInt, leftInt, rightInt;
    	
    	for (int i = 1; i < grid.length - 1; i++) {
    		for (int j = 1; j < grid[i].length() - 1; j++) {
    			currentInt = Character.getNumericValue(grid[i].charAt(j));
    			topInt = Character.getNumericValue(grid[i - 1].charAt(j));
    			bottomInt = Character.getNumericValue(grid[i + 1].charAt(j));
    			leftInt = Character.getNumericValue(grid[i].charAt(j - 1));
    			rightInt = Character.getNumericValue(grid[i].charAt(j + 1));
    			    			
    			if (currentInt > topInt && currentInt > bottomInt && currentInt > leftInt && currentInt > rightInt) {
    				grid[i] = grid[i].substring(0, j) + "X" + grid[i].substring(j + 1);
    			}
    		}
    	}
    	return grid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);
        System.out.println(Arrays.toString(result));

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(result[i]);
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
