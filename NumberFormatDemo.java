import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a number as a string: ");
        String text = scanner.next();
        
        scanner.close();
        
        // Generating NumberFormatException
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        // Handling NumberFormatException
        handleException(text);
    }

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Attempting to parse a non-numeric string
        int number = Integer.parseInt(text); // This will throw an exception if text is not a valid number
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            // Attempting to parse the string to an integer
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}

/*
Input:
Enter a number as a string: abc123

Output:
Exception caught in main: For input string: "abc123"
NumberFormatException caught: Invalid number format
*/

