package Day1_PracticeProblems.level2;
import java.util.Scanner;

public class DoubleOperations {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        
        double op1 = a + b * c;    
        double op2 = a * b + c;
        double op3 = c + a / b;    
        double op4 = a % b + c;    
        
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f", op1, op2, op3, op4);
    }
}
