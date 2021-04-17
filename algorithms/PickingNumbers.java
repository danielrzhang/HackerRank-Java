package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result5 {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    	int downCounter = 0;
    	int upCounter = 0;
    	int maxCounter = 0;
    	
    	for (int i = 0; i < a.size(); i++) {
    		downCounter = 0;
    		upCounter = 0;
    		
    		for (int j = 0; j < a.size(); j++) {
    			
    			if (a.get(i) - a.get(j) == 1) {
    				downCounter++;
    			} 
    			
    			if (a.get(i) - a.get(j) == -1) {
    				upCounter++;
    			}
    			
    			if (a.get(i) - a.get(j) == 0) {
    				downCounter++;
    				upCounter++;
    			}
    		}
    		
    		if (upCounter > maxCounter) {
    			maxCounter = upCounter;
    		}
    		
    		if (downCounter > maxCounter) {
    			maxCounter = downCounter;
    		}
    		
    	}
    	return maxCounter;
    }
}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result5.pickingNumbers(a);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
