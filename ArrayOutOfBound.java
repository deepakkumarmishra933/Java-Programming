public class ArrayOutOfBound {
    public static void main(String[] args) {
        System.out.println("Initializing array...");
        
        try {
            // Create an array of size 3 (valid indexes are 0, 1, 2)
            int[] numbers = {10, 20, 30};
            
            // Attempting to access the 6th element (index 5)
            System.out.println("Value at index 5 is: " + numbers[5]); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: You tried to access an index outside the array's limits.");
            System.out.println("Error details: " + e.getMessage());
        }
        
        System.out.println("Program recovered and finished successfully.");
    }
}