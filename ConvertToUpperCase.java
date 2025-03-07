import java.util.Scanner;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        scanner.close();
        
        // Converting text to uppercase using user-defined method
        String manualUpper = convertToUpper(text);
        
        // Converting text to uppercase using built-in method
        String builtInUpper = text.toUpperCase();
        
        // Comparing both results
        boolean isSame = compareStrings(manualUpper, builtInUpper);
        
        // Displaying results
        System.out.println("Manual conversion: " + manualUpper);
        System.out.println("Built-in conversion: " + builtInUpper);
        System.out.println("Are both results same? " + isSame);
    }

    // Method to convert string to uppercase manually
    public static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Converting to uppercase
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
Manual conversion: HELLO WORLD
Built-in conversion: HELLO WORLD
Are both results same? true
*/
