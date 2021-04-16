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

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	Collections.sort(arr);
    	
    	int counter = 0;
    	int maxCounter = 0;
    	int mostFrequent = 0;
    	
    	for (int i = 0; i < arr.size(); i++) {
    		if (i < arr.size() - 1) {
	    		if (arr.get(i) != arr.get(i + 1)) {
	    			if (counter > maxCounter) {
	    				maxCounter = counter;
	    				mostFrequent = arr.get(i);
	    				counter = 0;
	    			}
	    		} else {
	    			counter++;
	    		}
    		} else {
    			
    		}
    	}
    	System.out.println(maxCounter);
    	return mostFrequent;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
