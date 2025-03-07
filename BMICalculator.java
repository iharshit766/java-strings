import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        double[][] data = new double[numPersons][2];
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        scanner.close();
        
        String[][] results = calculateBMI(data);
        displayResults(results);
    }
    
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);
            
            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", height * 100); // Convert back to cm
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = determineStatus(bmi);
        }
        return results;
    }
    
    public static String determineStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    
    public static void displayResults(String[][] results) {
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI  | Status");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%6d | %10s | %10s | %4s | %s\n", (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
}

/*
Input:
Enter the number of persons: 3
Enter weight (kg) for person 1: 70
Enter height (cm) for person 1: 175
Enter weight (kg) for person 2: 85
Enter height (cm) for person 2: 168
Enter weight (kg) for person 3: 50
Enter height (cm) for person 3: 160

Output:
Person | Weight (kg) | Height (cm) | BMI  | Status
------------------------------------------------
     1 |      70.00 |     175.00 | 22.86 | Normal
     2 |      85.00 |     168.00 | 30.12 | Overweight
     3 |      50.00 |     160.00 | 19.53 | Normal
*/
