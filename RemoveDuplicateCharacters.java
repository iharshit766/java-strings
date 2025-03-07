import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Remove duplicate characters
        String result = removeDuplicates(input);
        
        // Display result
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString();
    }
}

/*
Input:
Enter a string: programming

Output:
String after removing duplicates: progamin

Input:
Enter a string: java

Output:
String after removing duplicates: jav
*/
