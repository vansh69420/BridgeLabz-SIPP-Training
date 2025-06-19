package Day4_JavaMethods;
import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
    
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || 
               (month > 3 && month < 6) || 
               (month == 6 && day <= 20);
    }
}
