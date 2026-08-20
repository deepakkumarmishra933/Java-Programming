// Abstract class: cannot be instantiated directly
abstract class Vehicle {
    // Abstract method: no body, subclasses MUST implement this
    abstract void startEngine();

    // Concrete method: shared implementation
    public void turnOffEngine() {
        System.out.println("Engine is now turned off.");
    }
}

// Concrete subclass provides the implementation for the abstract method
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Kickstarting the motorcycle engine... Vroom!");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Pressing the power button. The car starts silently.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // Error: Cannot instantiate an abstract class
        
        Vehicle bike = new Motorcycle();
        Vehicle tesla = new ElectricCar();

        bike.startEngine();
        bike.turnOffEngine();
        
        System.out.println("---");
        
        tesla.startEngine();
        tesla.turnOffEngine();
    }
}