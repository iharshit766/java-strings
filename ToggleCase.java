import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        scanner.close();
        
        // Toggle case of each character
        String toggledString = toggleCase(inputString);
        
        // Display result
        System.out.println("Toggled case string: " + toggledString);
    }

    // Method to toggle the case of each character in a string
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}

/*
Input:
Enter a string: Hello World!

Output:
Toggled case string: hELLO wORLD!

Input:
Enter a string: Java123

Output:
Toggled case string: jAVA123
*/

