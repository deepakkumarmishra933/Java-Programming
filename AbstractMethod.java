abstract class Shape {
    // Declaring an abstract method (no body)
    abstract void calculateArea();
}

class Rectangle extends Shape {
    int width = 5;
    int height = 10;
    
    // Subclass MUST implement the abstract method
    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: " + (width * height));
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Shape myShape = new Rectangle();
        myShape.calculateArea();
    }
}