package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result8 {

	/*
	 * Complete the 'countingSort' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static List<Integer> countingSort(List<Integer> arr) {
		int maxValue = Collections.max(arr);
		
		List<Integer> newList = new ArrayList<Integer>();
		List<Integer> realList = new ArrayList<Integer>();
		
		for (int i = 0; i <= maxValue; i++) {
			newList.add(0);
		}

		for (int i = 0; i < arr.size(); i++) {
			newList.set(arr.get(i), newList.get(arr.get(i)) + 1);
		}
		
		int temp;
		for (int i = 0; i < newList.size(); i++) {
			temp = newList.get(i);
			
			for (int j = 0; j < temp; j++) {
				realList.add(i);
			}
		}
		return realList;
	}
}

public class CountingSort2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result8.countingSort(arr);
		System.out.println(result);

		//        bufferedWriter.write(
		//            result.stream()
		//                .map(Object::toString)
		//                .collect(joining(" "))
		//            + "\n"
		//        );

		bufferedReader.close();
		//        bufferedWriter.close();
	}
}
