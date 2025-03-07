import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        scanner.close();
        
        // Finding length using user-defined method
        int manualLength = findStringLength(text);
        
        // Finding length using built-in method
        int builtInLength = text.length();
        
        // Displaying results
        System.out.println("Manual length calculation: " + manualLength);
        System.out.println("Built-in length calculation: " + builtInLength);
    }

    // Method to find string length without using length() method
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
}

/*
Input:
Enter a string: Hello

Output:
Manual length calculation: 5
Built-in length calculation: 5
*/
