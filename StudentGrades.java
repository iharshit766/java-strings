import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.close();
        
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        
        displayScorecard(scores, results, grades);
    }
    
    // Method to generate random scores
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50; // Physics
            scores[i][1] = rand.nextInt(51) + 50; // Chemistry
            scores[i][2] = rand.nextInt(51) + 50; // Math
        }
        return scores;
    }
    
    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percentage;
        }
        return results;
    }
    
    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
    
    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%7d | %7d | %9d | %4d | %5.0f | %7.2f | %10.2f | %s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}

/*
Input:
Enter number of students: 3

Output:
Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade
----------------------------------------------------------------------------
      1 |      78 |        85 |   92 |   255 |   85.00 |      85.00 | A
      2 |      65 |        70 |   68 |   203 |   67.67 |      67.67 | C
      3 |      90 |        88 |   91 |   269 |   89.67 |      89.67 | A
*/
