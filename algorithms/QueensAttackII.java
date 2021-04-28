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
    	int up = n - r_q;
    	int down = r_q - 1;
    	int right = n - c_q;
    	int left = c_q - 1;
    	int upRight = Math.min(up, right);
    	int downRight = Math.min(right, down);
    	int upLeft = Math.min(left, up);
    	int downLeft = Math.min(left, down);
    	
    	for (List<Integer> obstacle: obstacles) {
    		if (obstacle.get(1) == c_q) {
    			if (obstacle.get(0) < r_q) {
    				down = Math.min(down, r_q - 1 - obstacle.get(0));
    			} else {
    				up = Math.min(up, obstacle.get(0) - r_q - 1);
    			}
    		} else if (obstacle.get(0) == r_q) {
    			if (obstacle.get(1) < c_q) {
    				left = Math.min(left, c_q - 1 - obstacle.get(1));
    			} else {
    				right = Math.min(right, obstacle.get(1) - c_q - 1);
    			}
    		} else if (Math.abs(obstacle.get(0) - r_q) == Math.abs(obstacle.get(1) - c_q)) {
    			if (obstacle.get(1) > c_q) {
    				if (obstacle.get(0) > r_q) {
    					upRight = Math.min(upRight, obstacle.get(1) - c_q - 1);
    				} else {
    					downRight = Math.min(downRight, obstacle.get(1) - c_q - 1);
    				}
    			} else {
    				if (obstacle.get(0) > r_q) {
    					upLeft = Math.min(upLeft, c_q - 1 - obstacle.get(1));
    				} else {
    					downLeft = Math.min(downLeft, c_q - 1 - obstacle.get(1));
    				}
    			}
    		}
    	}
    	return up + down + left + right + upRight + upLeft + downLeft + downRight;
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
