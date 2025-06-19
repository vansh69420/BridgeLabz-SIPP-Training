package Day4_JavaMethods;
import java.util.*;
public class FactorAnalyzer {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        
        int sum = sumFactors(factors);
        System.out.println("Sum of factors: " + sum);
        
        int sumSquares = sumSquares(factors);
        System.out.println("Sum of squares: " + sumSquares);
        
        int product = productFactors(factors);
        System.out.println("Product of factors: " + product);
    }
    
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    
    public static int sumSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f * f;
        return sum;
    }
    
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }
}
