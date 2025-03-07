import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        
        // Find the longest word
        String longestWord = findLongestWord(sentence);
        
        // Display result
        System.out.println("Longest word in the sentence: " + longestWord);
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}

/*
Input:
Enter a sentence: Java programming is fun

Output:
Longest word in the sentence: programming

Input:
Enter a sentence: I love coding

Output:
Longest word in the sentence: coding
*/
