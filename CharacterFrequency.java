import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[][] frequencyResult = findCharacterFrequency(input);
        
        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        for (String[] entry : frequencyResult) {
            if (entry[0] != null) {
                System.out.println("    " + entry[0] + "     |     " + entry[1]);
            }
        }
    }
    
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // ASCII character set size
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        String[][] result = new String[text.length()][2];
        int index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(frequency[c]);
                frequency[c] = 0; // Avoid duplicate entries
                index++;
            }
        }
        
        return result;
    }
}

/*
Input:
apple

Output:
Character | Frequency
--------------------
    a     |     1
    p     |     2
    l     |     1
    e     |     1
*/
