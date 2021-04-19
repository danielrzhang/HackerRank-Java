package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
    	int numInitialBars = n / c;
    	int barsEaten = numInitialBars;
    	int numWrappers = numInitialBars;
    	int barsBought = numInitialBars;
    	int remainingWrappers;
    	boolean running = true;
    	
    	while (running) {
    		if (barsBought <= 0) {
    			running = false;
    		} else {
    			barsBought = numWrappers / m;
        		remainingWrappers = numWrappers % m;

    			barsEaten += barsBought;
        		
        		numWrappers = barsBought + remainingWrappers; 
    		}   		
    	}
    	return barsEaten;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
