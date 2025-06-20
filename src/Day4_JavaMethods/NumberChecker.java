package Day4_JavaMethods;
import java.util.*;
public class NumberChecker {
	public static void main(String[] args) {
                int num1 = 7;
        System.out.println(num1 + " is prime? " + isPrime(num1));
        
        int num2 = 9;
        System.out.println(num2 + " is neon? " + isNeon(num2));
        
        int num3 = 123;
        System.out.println(num3 + " is spy? " + isSpy(num3));
        
        int num4 = 25;
        System.out.println(num4 + " is automorphic? " + isAutomorphic(num4));
        
        int num5 = 49;
        System.out.println(num5 + " is buzz? " + isBuzz(num5));
    }
    
        public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
        public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        return sum == num;
    }
    
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        return sum == product;
    }
    
    public static boolean isAutomorphic(int num) {
        long square = (long) num * num;
        long temp = num;
        
        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }
    
        public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }
}
