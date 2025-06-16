package Day_2;
import java.util.*;
public class SumUntilZeroOrNegativeWithBreak {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double num = scanner.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num;
        }
        
        System.out.println("Total sum: " + total);
    }
}
