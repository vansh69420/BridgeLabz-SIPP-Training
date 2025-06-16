package Day1_PracticeProblems.level1;
import java.util.Scanner;

public class TotalPriceCalculation {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        double total = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f", 
                         total, quantity, unitPrice);
    }
}
