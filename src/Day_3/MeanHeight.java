package Day_3;
import java.util.*;
public class MeanHeight {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter heights of 11 players (in cm):");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.printf("Mean height: %.2f cm", mean);
    }
}
