package Day4_JavaMethods;
import java.util.*;
public class Division {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();
        
        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
    
    public static int[] findRemainderAndQuotient(int num, int div) {
        return new int[]{num / div, num % div};
    }
}
