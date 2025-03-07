import java.util.Scanner;

public class StringSubstringComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the string: ");
        String text = scanner.next();
        
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        
        scanner.close();
        
        // Getting substring using charAt()
        String charAtSubstring = getSubstringUsingCharAt(text, start, end);
        
        // Getting substring using built-in substring() method
        String builtInSubstring = text.substring(start, end);
        
        // Comparing the two substrings
        boolean areEqual = compareUsingCharAt(charAtSubstring, builtInSubstring);
        

        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
    }
    
    // Method to create a substring using charAt()
    public static String getSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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
Enter the string: HelloWorld
Enter the start index: 2
Enter the end index: 7

Output:
Substring using charAt(): lloWo
Substring using substring(): lloWo
Are both substrings equal? true
*/
