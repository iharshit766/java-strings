import java.util.Scanner;

public class CharacterFrequency2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        char[] uniqueChars = findUniqueCharacters(input);
        String[][] frequencyResult = findCharacterFrequency(input, uniqueChars);
        
        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        for (String[] entry : frequencyResult) {
            if (entry[0] != null) {
                System.out.println("    " + entry[0] + "     |     " + entry[1]);
            }
        }
    }
    
    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < index; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                unique[index++] = currentChar;
            }
        }
        
        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }
    
    public static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(frequency[c]);
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
