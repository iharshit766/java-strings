import java.util.Scanner;
import java.util.Arrays;

public class SplitTextIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        scanner.close();
        
        // Splitting text using user-defined method
        String[] manualSplit = splitText(text);
        
        // Splitting text using built-in method
        String[] builtInSplit = text.split(" ");
        
        // Comparing both results
        boolean isSame = compareStringArrays(manualSplit, builtInSplit);
        
        // Displaying results
        System.out.println("Manual split: " + Arrays.toString(manualSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Are both results same? " + isSame);
    }

    // Method to split text into words manually
    public static String[] splitText(String text) {
        int wordCount = 1; // At least one word
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
}

/*
Input:
Enter a string: Hello World This is Java

Output:
Manual split: [Hello, World, This, is, Java]
Built-in split: [Hello, World, This, is, Java]
Are both results same? true
*/
