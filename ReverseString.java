import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Reverse the string
        String reversed = reverseString(input);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a string without using built-in functions
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
        }
        return new String(charArray);
    }
}

/*
Input:
Enter a string: Hello World

Output:
Reversed string: dlroW olleH
*/
