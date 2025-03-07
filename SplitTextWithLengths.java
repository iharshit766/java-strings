import java.util.Scanner;
import java.util.Arrays;

public class SplitTextWithLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        scanner.close();
        
        // Splitting text into words
        String[] words = splitText(text);
        
        // Generating 2D array with words and their lengths
        String[][] wordLengths = getWordLengths(words);
        
        // Displaying results in tabular format
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }
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

    // Method to find string length without using length()
    public static int getStringLength(String word) {
        int length = 0;
        try {
            while (true) {
                word.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    // Method to create 2D array with words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        
        return wordLengths;
    }
}

/*
Input:
Enter a string: Hello World This is Java

Output:
Word    Length
----------------
Hello   5
World   5
This    4
is      2
Java    4
*/
