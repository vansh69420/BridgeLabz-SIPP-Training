package Day4_JavaMethods;
import java.util.*;
public class NaturalSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int sum = sumNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
    
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
