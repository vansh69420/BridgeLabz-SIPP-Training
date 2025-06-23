package Day5_JavaString;
import java.util.*;
public class RockPaperScissors {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games would you like to play? ");
        int games = scanner.nextInt();
        
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.println("\nGame " + (i+1));
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            
            String result = determineWinner(playerChoice, computerChoice);
            System.out.println("Result: " + result);
            
            if (result.equals("Player wins!")) {
                playerWins++;
            } else if (result.equals("Computer wins!")) {
                computerWins++;
            } else {
                ties++;
            }
        }
        
        displayResults(games, playerWins, computerWins, ties);
    }
    
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3);
        switch (random) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }
    
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Tie!";
        }
        
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }
    
    public static void displayResults(int totalGames, int playerWins, int computerWins, int ties) {
        System.out.println("\nFinal Results:");
        System.out.println("+------------+------------+------------+------------+");
        System.out.println("| Total Games| Player Wins| Computer Wins|    Ties    |");
        System.out.println("+------------+------------+------------+------------+");
        System.out.printf("| %10d | %10d | %11d | %10d |\n", 
                         totalGames, playerWins, computerWins, ties);
        System.out.println("+------------+------------+------------+------------+");
        
        double playerPercentage = (double)playerWins / totalGames * 100;
        double computerPercentage = (double)computerWins / totalGames * 100;
        
        System.out.printf("\nPlayer win percentage: %.1f%%\n", playerPercentage);
        System.out.printf("Computer win percentage: %.1f%%\n", computerPercentage);
    }
}
