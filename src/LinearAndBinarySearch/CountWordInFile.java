package LinearAndBinarySearch;

import java.io.*;

public class CountWordInFile {
    public static void main(String[] args) throws IOException {
        String target = "hello";
        int count = 0;
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\W+");
            for (String w : words) {
                if (w.equalsIgnoreCase(target)) count++;
            }
        }
        br.close();
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
