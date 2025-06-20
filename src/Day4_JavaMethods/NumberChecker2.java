package Day4_JavaMethods;
import java.util.*;
public class NumberChecker2 {
	public static void main(String[] args) {
        int number = 21;
        
        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));
        
        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squared digits: " + sumSquaredDigits(digits));
        System.out.println("Is Harshad number? " + isHarshadNumber(number, digits));
        
        int[][] digitFrequency = getDigitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] freq : digitFrequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
            }
        }
    }
    
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }
    
    public static int[] getDigitsArray(int num) {
        num = Math.abs(num);
        int[] digits = new int[countDigits(num)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
        public static int sumSquaredDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    
    public static boolean isHarshadNumber(int num, int[] digits) {
        if (num == 0) return false;
        return num % sumDigits(digits) == 0;
    }
    
        public static int[][] getDigitFrequency(int num) {
        int[] digits = getDigitsArray(num);
        int[][] frequency = new int[10][2];
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }
}
