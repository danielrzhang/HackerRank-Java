package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	String date = "";
    	
    	if (year <= 1917) {
    		if (year % 4 == 0) {
    			date = "12.09." + String.valueOf(year); 
    		} else {
    			date = "13.09." + String.valueOf(year);
    		}
    	} else if (year >= 1919) {
    		if (year % 4 == 0) {
        		if (year % 100 == 0 && year % 400 == 0) {
        			date = "12.09." + String.valueOf(year);
        		} else if (year % 100 == 0 && year % 400 != 0){
        			date = "13.09." + String.valueOf(year);
        		} else {
        			date = "12.09." + String.valueOf(year);
        		}
        	} else {
        		date = "13.09." + String.valueOf(year);
        	}
    	} else {
    		date = "26.09." + String.valueOf(year);
    	}
    	return date;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);
        System.out.println(result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
