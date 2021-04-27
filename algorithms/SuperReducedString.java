package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result10 {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    	String newString = "";
    	boolean running = true;
    	boolean tripped;
    	
    	while (running) {
    		tripped = false;
    		newString = "";
    		
	    	for (int i = 0; i < s.length(); i++) {
	    		if (i <= s.length() - 2) {
	    			if (s.charAt(i) == s.charAt(i + 1)) {
	    				tripped = true;
	    				i++;
	    			} else {
	    				newString += s.charAt(i);
	    			}
	    		} else {
	    			newString += s.charAt(i);
	    		}
	    	}
	    	
	    	if (tripped) {
	    		s = newString;
	    		newString = "";
	    	} else {
	    		running = false;
	    	}
    	}
    	
    	if (newString.equals("")) {
    		return "Empty String";
    	} else {
    		return newString;
    	}
    }
}

public class SuperReducedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result10.superReducedString(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
