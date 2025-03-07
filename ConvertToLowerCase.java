
import java.util.Scanner;

public class ConvertToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        scanner.close();
        
        // Converting text to lowercase using user-defined method
        String manualLower = convertToLower(text);
        
        // Converting text to lowercase using built-in method
        String builtInLower = text.toLowerCase();
        
        // Comparing both results
        boolean isSame = compareStrings(manualLower, builtInLower);
        

        System.out.println("Manual conversion: " + manualLower);
        System.out.println("Built-in conversion: " + builtInLower);
        System.out.println("Are both results same? " + isSame);
    }

    // Method to convert string to lowercase manually
    public static String convertToLower(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); // Converting to lowercase
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}

/*
Input:
Enter a string: Hello World

Output:
Manual conversion: hello world
Built-in conversion: hello world
Are both results same? true
*/
