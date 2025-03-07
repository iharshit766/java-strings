import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        char firstNonRepeating = findFirstNonRepeatingCharacter(input);
        
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // ASCII character set size
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        
        return '\0'; // Return null character if no unique character found
    }
}

/*
Input:
hello world

Output:
First non-repeating character: h
*/
