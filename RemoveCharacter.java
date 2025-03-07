import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Taking user input for the character to remove
        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);
        
        scanner.close();
        
        // Removing the specified character
        String modifiedString = removeCharacter(str, ch);
        
        // Display result
        System.out.println("Modified String: " + modifiedString);
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        
        return result.toString();
    }
}

/*
Input:
Enter a string: Hello World
Enter the character to remove: l

Output:
Modified String: Heo Word
*/
