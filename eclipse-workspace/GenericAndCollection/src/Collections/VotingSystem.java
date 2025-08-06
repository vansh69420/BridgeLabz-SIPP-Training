package Collections;



import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        Map<String, Integer> voteMap = new HashMap<>();
        voteMap.put("Alice", 3);
        voteMap.put("Bob", 5);
        voteMap.put("Carol", 2);


        Map<String, Integer> orderedVotes = new LinkedHashMap<>();
        orderedVotes.put("Alice", 1);
        orderedVotes.put("Bob", 1);
        orderedVotes.put("Alice", orderedVotes.getOrDefault("Alice", 0) + 1);
        orderedVotes.put("Carol", 1);

        System.out.println("Order of votes (LinkedHashMap):");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        Map<String, Integer> sortedResults = new TreeMap<>(voteMap);
        System.out.println("\nResults (TreeMap, sorted by candidate):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}