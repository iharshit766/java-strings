public class NullPointerDemo {
    public static void main(String[] args) {
        // Generating NullPointerException
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        // Handling NullPointerException
        handleException();
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempting to access a method on a null reference
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot access methods on a null object");
        }
    }
}

/*
Output:
Exception caught in main: null
NullPointerException caught: Cannot access methods on a null object
*/
