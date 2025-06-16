package Day_2;
import java.util.*;
public class SumOfNaturalNumbersForVsFormula {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a natural number.");
            return;
        }
        
        // Using formula
        int formulaSum = n * (n + 1) / 2;
        
        // Using for loop
        int forSum = 0;
        for (int i = 1; i <= n; i++) {
            forSum += i;
        }
        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + forSum);
        System.out.println("Both results are " + (formulaSum == forSum ? "equal" : "not equal"));
    }
}
