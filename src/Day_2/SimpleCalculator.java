package Day_2;
import java.util.*;
public class SimpleCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();
        
        double result;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = first / second;
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
