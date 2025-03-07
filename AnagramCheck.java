import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for two texts
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();
        scanner.close();
        
        // Checking if the texts are anagrams
        boolean isAnagram = checkAnagram(text1, text2);
        
        // Displaying result
        System.out.println("Are the two texts anagrams? " + isAnagram);
    }
    
    // Method to check if two texts are anagrams
    public static boolean checkAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        
        int[] charFrequency = new int[256];
        
        // Counting frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            charFrequency[text1.charAt(i)]++;
        }
        
        // Subtracting frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            charFrequency[text2.charAt(i)]--;
        }
        
        // Checking if any frequency is non-zero
        for (int freq : charFrequency) {
            if (freq != 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Input:
listen
silent

Output:
Are the two texts anagrams? true
*/
