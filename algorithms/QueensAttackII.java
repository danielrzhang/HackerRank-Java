package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result7 {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    	int counter = 0;
    	    	
    	// Check Up
    	int row = r_q;
    	int column = c_q;
    	boolean stop;
    	while (row > 1) {
    		row--;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}
    		
    		counter++;
    		
    	}
    	
    	// Check Down
    	row = r_q;
    	column = c_q;
    	while (row < n) {
    		row++;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	
    	// Check Left
    	row = r_q;
    	column = c_q;
    	while (column > 1) {
    		column--;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	
    	// Check right
    	row = r_q;
    	column = c_q;
    	while (column < n) {
    		column++;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	
    	// Check up right
    	row = r_q;
    	column = c_q;
    	while (row > 1 && column < n) {
    		row--;
    		column++;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	
    	// Check down right
    	row = r_q;
    	column = c_q;
    	while (row < n && column < n) {
    		row++;
    		column++;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	
    	// Check up left
    	row = r_q;
    	column = c_q;
    	while (row > 1 && column > 1) {
    		row--;
    		column--;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	
    	// Check down left
    	row = r_q;
    	column = c_q;
    	while (row < n && column > 1) {
    		row++;
    		column--;
    		stop = false;
    		for (List<Integer> lst: obstacles) {
    			if (row == lst.get(0) && column == lst.get(1)) {
    				obstacles.remove(lst);
    				stop = true;
    				break;
    			}
    		}
    		if (stop) {
    			break;
    		}

    		counter++;
    		
    	}
    	return counter;
    }
}

public class QueensAttackII {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result7.queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
