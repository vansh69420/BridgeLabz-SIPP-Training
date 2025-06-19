package Day4_JavaMethods;
import java.util.*;
public class HandshakeCalculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum handshakes: " + handshakes);
    }
    
    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }
}
