package LinearAndBinarySearch;

import java.io.*;

public class ChallengeCompareAll {
    public static void main(String[] args) throws IOException {
        int N = 1_000_000;
        String str = "hello";

        // StringBuilder
        long start = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < N; i++) sbuilder.append(str);
        long end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) / 1e6 + " ms");

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) sbuf.append(str);
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) / 1e6 + " ms");

        // FileReader
        start = System.nanoTime();
        FileReader fr = new FileReader("largefile.txt");
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) wordCount += line.split("\\s+").length;
        br.close();
        end = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount + ", time: " + (end - start) / 1e6 + " ms");

        // InputStreamReader
        start = System.nanoTime();
        FileInputStream fis = new FileInputStream("largefile.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br2 = new BufferedReader(isr);
        wordCount = 0;
        while ((line = br2.readLine()) != null) wordCount += line.split("\\s+").length;
        br2.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount + ", time: " + (end - start) / 1e6 + " ms");
    }
}