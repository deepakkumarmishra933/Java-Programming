public class ArrayStoreExceptionn {
    public static void main(String[] args) {
        System.out.println("Attempting to store elements in the array...");
        
        try {
            // Create an array of Strings, but reference it as an array of Objects
            Object[] stringArray = new String[5];
            
            // Storing a String is perfectly fine
            stringArray[0] = "Hello Java"; 
            
            // Attempting to store an Integer in an array instantiated for Strings
            // The compiler allows this because 'Integer' is an 'Object', 
            // but the JVM catches the incompatibility at runtime.
            stringArray[1] = 100; 
        } 
        catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException Caught: Incompatible data type inserted into the array.");
            System.out.println("Error details: " + e.getMessage());
        }
        
        System.out.println("Program recovered and finished successfully.");
    }
}