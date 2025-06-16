package Day1_PracticeProblems.level2;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f", 
                         num1, num2, add, sub, mul, div);
    }
}
