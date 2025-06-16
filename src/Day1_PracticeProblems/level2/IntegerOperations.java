package Day1_PracticeProblems.level2;
import java.util.Scanner;

public class IntegerOperations {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        
        int op1 = a + b * c;    
        int op2 = a * b + c;
        int op3 = c + a / b;    
        int op4 = a % b + c;    
        
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d", op1, op2, op3, op4);
    }
}
