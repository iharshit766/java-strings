import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        
        // Display result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true; // The string is a palindrome
    }
}

/*
Input:
Enter a string: madam

Output:
The string is a palindrome.

Input:
Enter a string: hello

Output:
The string is not a palindrome.
*/
