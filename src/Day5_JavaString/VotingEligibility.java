package Day5_JavaString;
import java.util.*;
public class VotingEligibility {
	public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);
    }
    
    public static int[] generateRandomAges(int count) {
        Random random = new Random();
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = 10 + random.nextInt(50); 
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid (Negative)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }
    
    public static void displayResults(String[][] data) {
        System.out.println("+-----+------------------+");
        System.out.println("| Age | Voting Eligibility |");
        System.out.println("+-----+------------------+");
        for (String[] row : data) {
            System.out.printf("| %3s | %-16s |\n", row[0], row[1]);
        }
        System.out.println("+-----+------------------+");
    }
}
