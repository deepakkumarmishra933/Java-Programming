public class Calculator {
    
    // Defining a method that takes two integers and returns their sum
    public int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the method
        int result = calc.calculateSum(10, 15);
        System.out.println("The sum is: " + result);
    }
}