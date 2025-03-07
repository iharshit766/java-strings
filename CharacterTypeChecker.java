import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        scanner.close();
        
        // Getting character classifications
        String[][] charTypes = classifyCharacters(text);
        
        // Displaying results in tabular format
        displayCharacterTypes(charTypes);
    }

    // Method to classify characters as Vowel, Consonant, or Not a Letter
    public static String classifyCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to classify all characters in a string
    public static String[][] classifyCharacters(String text) {
        String[][] charTypes = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            charTypes[i][0] = String.valueOf(text.charAt(i));
            charTypes[i][1] = classifyCharacter(text.charAt(i));
        }
        
        return charTypes;
    }

    // Method to display character classifications in tabular format
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        System.out.println("----------------");
        for (String[] charType : charTypes) {
            System.out.println(charType[0] + "\t\t" + charType[1]);
        }
    }
}

/*
Input:
Enter a string: Hello, World!

Output:
Character   Type
----------------
H           Consonant
e           Vowel
l           Consonant
l           Consonant
o           Vowel
,           Not a Letter
            Not a Letter
W           Consonant
o           Vowel
r           Consonant
l           Consonant
d           Consonant
!           Not a Letter
*/
