package Day4_JavaMethods;
import java.util.*;
public class AdvancedFactorAnalyzer {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        
        System.out.println("Greatest factor: " + getGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cubes: " + productCubes(factors));
    }
    
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }
    
    public static int getGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }
    
    public static double productCubes(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }
}
