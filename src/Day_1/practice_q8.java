package Day_1;
import java.util.*;
public class practice_q8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextInt();
        double n2 = sc.nextInt();

        double quotient = n1 / n2;
        double remainder = n1 % n2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + n1 + " and " + n2);
    }

}
