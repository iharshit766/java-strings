import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        int length = getLength(input);
        char[] uniqueChars = findUniqueCharacters(input, length);
        
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }
    }
    
    public static int getLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }
    
    public static char[] findUniqueCharacters(String text, int length) {
        char[] unique = new char[length];
        int uniqueIndex = 0;
        
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                unique[uniqueIndex++] = current;
            }
        }
        
        char[] result = new char[uniqueIndex];
        System.arraycopy(unique, 0, result, 0, uniqueIndex);
        return result;
    }
}

/*
Input:
Hello World

Output:
Unique characters: H e l o   W r d
*/
