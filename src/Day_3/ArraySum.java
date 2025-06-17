package Day_3;
import java.util.*;
public class ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();
            
            if (num <= 0 || index >= 10) {
                break;
            }
            
            numbers[index] = num;
            index++;
        }

        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum of numbers: " + total);
	}
}
