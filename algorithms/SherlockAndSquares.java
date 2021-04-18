package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class SherlockAndSquares {

    // Complete the squares function below.
    static int squares(int a, int b) {
    	int counter = 0;
    	
    	for (int i = (int) Math.ceil(Math.sqrt(a)); i <= (int) Math.floor(Math.sqrt(b)); i++) {
    		counter++;
    	}
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
