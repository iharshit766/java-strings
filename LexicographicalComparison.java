import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();
        
        // Compare strings lexicographically
        int result = compareStrings(str1, str2);
        
        // Display result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }
        
        return len1 - len2;
    }
}

/*
Input:
Enter first string: apple
Enter second string: banana

Output:
"apple" comes before "banana" in lexicographical order.

Input:
Enter first string: mango
Enter second string: mango

Output:
Both strings are equal.
*/
