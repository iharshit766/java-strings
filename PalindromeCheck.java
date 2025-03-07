import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Checking palindrome using different methods
        boolean isPalindromeIterative = checkPalindromeIterative(input);
        boolean isPalindromeRecursive = checkPalindromeRecursive(input, 0, input.length() - 1);
        boolean isPalindromeArray = checkPalindromeUsingArray(input);

        // Displaying results
        System.out.println("Palindrome check using iteration: " + isPalindromeIterative);
        System.out.println("Palindrome check using recursion: " + isPalindromeRecursive);
        System.out.println("Palindrome check using character array: " + isPalindromeArray);
    }

    // Iterative approach to check palindrome
    public static boolean checkPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive approach to check palindrome
    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    // Using character array to check palindrome
    public static boolean checkPalindromeUsingArray(String text) {
        char[] charArray = text.toCharArray();
        int start = 0, end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/*
Input:
racecar

Output:
Palindrome check using iteration: true
Palindrome check using recursion: true
Palindrome check using character array: true
*/
