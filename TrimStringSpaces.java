import java.util.Scanner;

public class TrimStringSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();
        
        scanner.close();
        
        // Trim using custom method
        int[] trimIndexes = findTrimIndexes(text);
        String trimmedText = customSubstring(text, trimIndexes[0], trimIndexes[1]);
        
        // Trim using built-in method
        String builtInTrimmed = text.trim();
        
        // Compare results
        boolean areEqual = compareStrings(trimmedText, builtInTrimmed);
        
     
        System.out.println("Original Text: [" + text + "]");
        System.out.println("Custom Trimmed Text: [" + trimmedText + "]");
        System.out.println("Built-in Trimmed Text: [" + builtInTrimmed + "]");
        System.out.println("Are both trims identical? " + areEqual);
    }
    
    // Method to find the start and end indexes of trimmed text
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }
    
    // Method to extract substring without using substring()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    
    // Method to compare two strings
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
Sample Input:
Enter a string with spaces:   Hello World   

Output:
Original Text: [   Hello World   ]
Custom Trimmed Text: [Hello World]
Built-in Trimmed Text: [Hello World]
Are both trims identical? true
*/
