package Day_2;
import java.util.*;
public class SumOfNaturalNumbersWhileVsFormula {
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
        
        // Using while loop
        int whileSum = 0;
        int i = 1;
        while (i <= n) {
            whileSum += i;
            i++;
        }
        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + whileSum);
        System.out.println("Both results are " + (formulaSum == whileSum ? "equal" : "not equal"));
    }
}
