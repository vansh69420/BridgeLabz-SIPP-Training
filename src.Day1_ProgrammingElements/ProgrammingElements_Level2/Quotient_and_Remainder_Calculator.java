package ProgrammingElements_Level2;
import java.util.Scanner;

public class Quotient_and_Remainder_Calculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d",
                         quotient, remainder, num1, num2);
    }
}
