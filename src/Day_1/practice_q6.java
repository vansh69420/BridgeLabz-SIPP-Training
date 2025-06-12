package Day_1;
import java.util.*;
public class practice_q6 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fee = sc.nextInt();
        double discount = sc.nextInt();

        double discountAmount =  fee * ( discount / 100);

        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + "  and final discounted fee is INR " + finalFee);

    }
}
