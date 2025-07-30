package RuntimeAndNotation;

import java.io.*;

public class FileReadPerformance {
    public static void main(String[] args) throws IOException {
        String filename = "largefile.txt";

        long start = System.nanoTime();
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) wordCount += line.split("\\s+").length;
        br.close();
        long end = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount + ", time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        FileInputStream fis = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br2 = new BufferedReader(isr);
        wordCount = 0;
        while ((line = br2.readLine()) != null) wordCount += line.split("\\s+").length;
        br2.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount + ", time: " + (end - start) / 1e6 + " ms");
    }
}