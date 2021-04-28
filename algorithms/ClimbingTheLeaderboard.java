package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;

class Result14 {

	/*
	 * Complete the 'climbingLeaderboard' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY ranked
	 *  2. INTEGER_ARRAY player
	 */

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		ArrayList<Integer> listOfRanks = new ArrayList<Integer>();
		
		LinkedHashSet<Integer> newRanked = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < ranked.size(); i++) {
			newRanked.add(ranked.get(i));
		}
		
		int rankCounter, counter;
		for (int n: player) {
			rankCounter = 1;
			counter = 0;
			
			for (int j: newRanked) {
				if (n >= j) {
					listOfRanks.add(rankCounter);
					break;
				} else {
					if (counter == newRanked.size() - 1) {
						listOfRanks.add(++rankCounter);
						break;
					} else {
						rankCounter++;
					}
				}
				counter++;
			}
		}
		return listOfRanks;
	}
}

public class ClimbingTheLeaderboard {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result14.climbingLeaderboard(ranked, player);
		System.out.println(result);

		//        bufferedWriter.write(
		//            result.stream()
		//                .map(Object::toString)
		//                .collect(joining("\n"))
		//            + "\n"
		//        );

		bufferedReader.close();
		//        bufferedWriter.close();
	}
}
