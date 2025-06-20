package Day5_JavaString;
import java.util.*;
public class ExceptionDemo {
	public static void main(String[] args) {
                generateNullPointerException();
        
                handleNullPointerException();
    }
    
        public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }
    
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
