package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ACMICPCTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
    	String topic1, topic2;
    	int knowledgeCounter = 0, teamCounter = 0;
    	int maxKnowledge = 0;
    	
    	ArrayList<Integer> knowledge = new ArrayList<Integer>();
    	
    	for (int i = 0; i < topic.length - 1; i++) {
    		for (int j = i + 1; j < topic.length; j++) {
    			topic1 = topic[i];
    			topic2 = topic[j];
    			knowledgeCounter = 0;
    			
    			for (int k = 0; k < topic[j].length(); k++) {
    				if (topic1.substring(k, k + 1).equals("1") || topic2.substring(k, k + 1).equals("1")) {
    					knowledgeCounter++;
    				}
    			}
    			knowledge.add(knowledgeCounter);
    		}
    	}
    	
    	maxKnowledge = Collections.max(knowledge);
    	
    	for (int i = 0; i < knowledge.size(); i++) {
    		if (knowledge.get(i) == maxKnowledge) {
    			teamCounter++;
    		}
    	}
    	return new int[] {maxKnowledge, teamCounter};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);
        
        System.out.println(Arrays.toString(result));
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
