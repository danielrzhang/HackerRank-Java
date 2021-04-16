package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result3 {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	int currentNum = 1;
    	boolean satisfies;
    	int counter = 0;
    	
    	while (currentNum <= Math.max(Collections.max(a), Collections.max(b))) {
    		satisfies = true;
    		
    		for (int i = 0; i < a.size(); i++) {
    			if (currentNum % a.get(i) != 0) {
    				satisfies = false;
    				break;
    			}
    		}
    		
    		for (int i = 0; i < b.size(); i++) {
    			if (b.get(i) % currentNum != 0) {
    				satisfies = false;
    				break;
    			}
    		}
    		
    		if (satisfies) {
    			counter++;
    		}
    		currentNum++;
    	}
    	
    	return counter;
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result3.getTotalX(arr, brr);
        System.out.println(total);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
