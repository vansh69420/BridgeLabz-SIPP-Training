package LinearAndBinarySearch;

import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = new FileWriter("output.txt");
        String line;
        System.out.println("Enter text (type 'exit' to finish):");
        while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
            fw.write(line + "\n");
        }
        fw.close();
        System.out.println("Input saved to output.txt");
    }
}