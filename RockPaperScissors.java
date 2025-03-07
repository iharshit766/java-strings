import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter number of games: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] results = new String[numGames][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice(random);
            String result = determineWinner(userChoice, computerChoice);

            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;
            else draws++;

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = result;
        }
        scanner.close();

        displayResults(results, userWins, computerWins, draws, numGames);
    }

    // Method to generate computer's choice randomly
    public static String getComputerChoice(Random random) {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[random.nextInt(3)];
    }

    // Method to determine winner
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    // Method to display results
    public static void displayResults(String[][] results, int userWins, int computerWins, int draws, int totalGames) {
        System.out.println("\nGame Results:");
        System.out.println("------------------------------------");
        System.out.println("User Choice | Computer Choice | Result");
        System.out.println("------------------------------------");
        for (String[] result : results) {
            System.out.printf("%-11s | %-15s | %-6s\n", result[0], result[1], result[2]);
        }
        System.out.println("------------------------------------");
        System.out.printf("User Wins: %d (%.2f%%)\n", userWins, (userWins * 100.0 / totalGames));
        System.out.printf("Computer Wins: %d (%.2f%%)\n", computerWins, (computerWins * 100.0 / totalGames));
        System.out.println("Draws: " + draws);
    }
}

/*
Sample Input/Output:

Input:
Enter number of games: 3
Enter your choice (rock, paper, scissors): rock
Enter your choice (rock, paper, scissors): paper
Enter your choice (rock, paper, scissors): scissors

Output:
Game Results:
------------------------------------
User Choice | Computer Choice | Result
------------------------------------
rock        | scissors        | User   
paper       | rock           | User   
scissors    | scissors       | Draw   
------------------------------------
User Wins: 2 (66.67%)
Computer Wins: 0 (0.00%)
Draws: 1
*/
