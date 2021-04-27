package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

class Result13 {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    	char[] str = arr.get(0).toCharArray();
    	
    	HashSet<Character> chars = new HashSet<Character>();
    	
    	for (int i = 0; i < str.length; i++) {
    		chars.add(Character.valueOf(str[i]));
    	}
    	
    	int counter = 0;
    	boolean hasLetter;
    	
    	for (Character ch: chars) {
    		hasLetter = true;
    		
    		for (int i = 1; i < arr.size(); i++) {
    			if (!arr.get(i).contains(Character.toString(ch))) {
    				hasLetter = false;
    				break;
    			}
    		}
    		
    		if (hasLetter) {
    			counter++;
    		}
    	}
    	return counter;
    }
}

public class Gemstones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result13.gemstones(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
