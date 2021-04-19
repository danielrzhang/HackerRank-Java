package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
    	int numGames = 0;
    	boolean running = true;
    	int counter = 0;
    	
    	while (running) {
    		if (counter + p > s) {
    			running = false;
    		} else {
    			counter += p;
        		numGames++;
    		}
    		
    		if (p - d < m) {
    			p = m;
    		} else {
    			p -= d;
    		}		
    	}
    	return numGames;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
