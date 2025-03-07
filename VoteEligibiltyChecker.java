import java.util.Random;
import java.util.Scanner;

public class VoteEligibiltyChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        // Generating random ages for students
        int[] ages = generateRandomAges(n);
        
        // Checking voting eligibility
        String[][] eligibilityTable = checkVotingEligibility(ages);
        
        // Displaying the result in a tabular format
        displayEligibilityTable(eligibilityTable);
        
        scanner.close();
    }

    // Method to generate random ages for students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(40) - 5; // Generating ages from -5 to 35
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                table[i][1] = "Can Vote";
            } else if (ages[i] < 0) {
                table[i][1] = "Invalid Age";
            } else {
                table[i][1] = "Cannot Vote";
            }
        }
        return table;
    }

    // Method to display the eligibility table
    public static void displayEligibilityTable(String[][] table) {
        System.out.println("Age\tVoting Eligibility");
        System.out.println("-----------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}

/*
Example Input:
Enter the number of students: 10

Example Output:
Age    Voting Eligibility
-----------------------
12     Cannot Vote
-2     Invalid Age
25     Can Vote
17     Cannot Vote
30     Can Vote
19     Can Vote
-1     Invalid Age
15     Cannot Vote
22     Can Vote
35     Can Vote
*/
