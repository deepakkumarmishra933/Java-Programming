class Calculator {
    // This is a concrete method because it has a body and performs logic
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class ConcreteMethod {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the concrete method
        int result = calc.multiply(4, 5);
        System.out.println("The result is: " + result);
    }
}