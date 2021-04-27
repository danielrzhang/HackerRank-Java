package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

class Result12 {

	/*
	 * Complete the 'weightedUniformStrings' function below.
	 *
	 * The function is expected to return a STRING_ARRAY.
	 * The function accepts following parameters:
	 *  1. STRING s
	 *  2. INTEGER_ARRAY queries
	 */

	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
		
		int counter = 0;
		int stretchCounter = 0;
		
		HashSet<Integer> weights = new HashSet<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					counter += (int) (s.charAt(j)) - 96;
					stretchCounter++;
					weights.add(counter);
					
					if (j == s.length() - 1) {
						i += stretchCounter - 1;
						stretchCounter = 0;
						counter = 0;
					}
				} else {
					i += stretchCounter - 1;
					stretchCounter = 0;
					counter = 0;
					break;
				}
			}
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (Integer i: queries) {
			if (weights.contains(i)) {
				list.add("Yes");
			} else {
				list.add("No");
			}
		}
		return list;
	}
}

public class WeightedUniformStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(toList());

		List<String> result = Result12.weightedUniformStrings(s, queries);
		System.out.println(result);

		//        bufferedWriter.write(
		//            result.stream()
		//                .collect(joining("\n"))
		//            + "\n"
		//        );

		bufferedReader.close();
		//        bufferedWriter.close();
	}
}
