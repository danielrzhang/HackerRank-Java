package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberLineJumps {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	boolean running = true;
    	boolean canMeet = false;
    	
    	int initx1 = x1;
    	int initx2 = x2;
    	
    	while (running) {
    		if (x1 == x2) {
    			canMeet = true;
    			running = false;
    		}
    		
    		if ((initx1 < initx2 && x1 > x2) || (initx1 > initx2 && x1 < x2)) {
    			running = false;
    		}
    		
    		x1 += v1;
    		x2 += v2;
    	}
    	
    	if (canMeet) {
    		return "YES";
    	} else {
    		return "NO";
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
