package Day4_JavaMethods;
import java.util.*;
public class RandomAnalyzer {
	public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Generated numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        
        double[] stats = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f, Min: %d, Max: %d%n", 
                         stats[0], (int)stats[1], (int)stats[2]);
    }
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }
    
    public static double[] findAverageMinMax(int[] nums) {
        int sum = 0, min = nums[0], max = nums[0];
        for (int n : nums) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double)sum / nums.length;
        return new double[]{avg, min, max};
    }
}
