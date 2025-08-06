package Collections.MapInterface;

import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String filename) throws IOException {
        Map<String, Integer> freq = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
            for (String word : line.split("\\s+")) {
                if (!word.isEmpty())
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }
        br.close();
        return freq;
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> freq = countWords("input.txt");
        System.out.println(freq);
    }
}