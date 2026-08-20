class Vehicle {
    // Declaring a method as final
    final void startEngine() {
        System.out.println("Engine started using the standard ignition sequence.");
    }
}

class Car extends Vehicle {
    // Uncommenting the lines below will cause a compilation error:
    // @Override
    // void startEngine() { 
    //     System.out.println("Custom engine start.");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine(); // Inherits the final method from Vehicle
    }
}