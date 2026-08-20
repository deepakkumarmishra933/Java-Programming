public class ArithmeticExceptionn {
    public static void main(String[] args) {
        System.out.println("Attempting division...");
        
        try {
            // Dividing an integer by zero triggers the exception
            int numerator = 100;
            int denominator = 0;
            int result = numerator / denominator; 
            
            System.out.println("Result: " + result); // This line will be skipped
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException Caught: Cannot divide by zero.");
            System.out.println("Error details: " + e.getMessage());
        }
        
        System.out.println("Program recovered and finished successfully.");
    }
}