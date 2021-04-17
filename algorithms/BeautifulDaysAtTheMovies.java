package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	int reverseM, copyM, copyCopyM;
    	int counter = 0;
    	
    	for (int m = i; m <= j; m++) {
	    	reverseM = 0;
	    	copyM = m;
	    	copyCopyM = m;
	    	
	    	while (copyM > 0) {
	    		reverseM = (10 * reverseM) + (copyM % 10);
	    		copyM /= 10;
	    	}
	    	
	    	if (Math.abs(reverseM - copyCopyM) % k == 0) {
	    		counter++;
	    	}
    	}
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
