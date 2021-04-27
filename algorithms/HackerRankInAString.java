package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result11 {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    	String hackerrank = "hackerrank";
    	String newString = "";
    	int counter = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == hackerrank.charAt(counter)) {
    			newString += s.charAt(i);
    			counter++;    			
    		}
    		
    		if (counter == hackerrank.length()) {
				break;
			}
    	}
    	
    	if (newString.equals(hackerrank)) {
    		return "YES";
    	} else {
    		return "NO";
    	}
    }
}

public class HackerRankInAString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result11.hackerrankInString(s);
                System.out.println(result);

//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
