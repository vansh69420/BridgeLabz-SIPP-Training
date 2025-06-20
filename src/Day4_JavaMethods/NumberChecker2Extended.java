package Day4_JavaMethods;
import java.util.*;
public class NumberChecker2Extended {
	public static void main(String[] args) {
        int number = 153;
        
        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));
        
        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        System.out.println("Is Duck number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong number? " + isArmstrongNumber(number, digits));
        
        int[] largest = findLargestElements(digits);
        System.out.println("Largest: " + largest[0] + ", Second largest: " + largest[1]);
        
        int[] smallest = findSmallestElements(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second smallest: " + smallest[1]);
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
    
        public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    
        public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }
    
        public static int[] findLargestElements(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second && digit != first) {
                second = digit;
            }
        }
        
        return new int[]{first, second};
    }
    
        public static int[] findSmallestElements(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < first) {
                second = first;
                first = digit;
            } else if (digit < second && digit != first) {
                second = digit;
            }
        }
        
        return new int[]{first, second};
    }
}
