import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        scanner.close();
        
        // Finding the most frequent character
        char mostFrequentChar = findMostFrequentChar(str);
        
        // Display result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String str) {
        int[] frequency = new int[256]; // ASCII character frequency array
        
        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        
        // Find the character with the highest frequency
        int maxFreq = 0;
        char mostFrequentChar = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] > maxFreq) {
                maxFreq = frequency[str.charAt(i)];
                mostFrequentChar = str.charAt(i);
            }
        }
        
        return mostFrequentChar;
    }
}

/*
Input:
Enter a string: success

Output:
Most Frequent Character: 's'
*/
