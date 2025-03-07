import java.util.Scanner;

public class StringCharacterComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the string: ");
        String text = scanner.next();
        
        scanner.close();
        
        // Getting characters using user-defined method
        char[] userDefinedArray = getCharactersUsingCharAt(text);
        
        // Getting characters using built-in toCharArray() method
        char[] builtInArray = text.toCharArray();
        
        // Comparing the two arrays
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);
        

        System.out.println("Characters using user-defined method: " + new String(userDefinedArray));
        System.out.println("Characters using toCharArray(): " + new String(builtInArray));
        System.out.println("Are both arrays equal? " + areEqual);
    }
    
    // Method to return characters using charAt()
    public static char[] getCharactersUsingCharAt(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

/*
Input:
Enter the string: HelloWorld

Output:
Characters using user-defined method: HelloWorld
Characters using toCharArray(): HelloWorld
Are both arrays equal? true
*/
