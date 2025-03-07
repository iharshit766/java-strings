import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }
        
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        
        scanner.close();
        
        // Generating ArrayIndexOutOfBoundsException
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        // Handling ArrayIndexOutOfBoundsException
        handleException(names, index);
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Accessing an out-of-bounds index
        System.out.println("Accessed name: " + names[index]); // This will throw an exception
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            // Attempting to access an out-of-bounds index
            System.out.println("Accessed name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of range");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}

/*
Input:
Enter the number of names: 3
Enter the names:
Alice
Bob
Charlie
Enter an index to access: 5

Output:
Exception caught in main: Index 5 out of bounds for length 3
ArrayIndexOutOfBoundsException caught: Index is out of range
*/
