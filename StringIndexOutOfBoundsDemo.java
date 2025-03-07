import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        scanner.close();
        
        // Generating StringIndexOutOfBoundsException
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        // Handling StringIndexOutOfBoundsException
        handleException(text);
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing an index beyond the string length
        System.out.println(text.charAt(text.length())); // This will throw an exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Attempting to access an out-of-bounds index
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Index is out of range");
        }
    }
}

/*
Input:
Enter a string: Hello

Output:
Exception caught in main: String index out of range: 5
StringIndexOutOfBoundsException caught: Index is out of range
*/
