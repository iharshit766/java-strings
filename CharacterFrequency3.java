import java.util.Scanner;

public class CharacterFrequency3 {
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
        int length = text.length();
        char[] characters = text.toCharArray();
        int[] frequency = new int[length];
        
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            for (int j = 0; j < i; j++) {
                if (characters[i] == characters[j]) {
                    frequency[j]++;
                    frequency[i] = 0;
                    break;
                }
            }
        }
        
        int uniqueCount = 0;
        for (int f : frequency) {
            if (f > 0) uniqueCount++;
        }
        
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf(characters[i]);
                result[index][1] = String.valueOf(frequency[i]);
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
