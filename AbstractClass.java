abstract class Appliance {
    void plugIn() {
        System.out.println("Appliance is plugged into the wall.");
    }
}

// Subclassing the abstract class
class Toaster extends Appliance {
    void toast() {
        System.out.println("Bread is toasting.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Appliance app = new Appliance(); // This causes an error
        
        Toaster myToaster = new Toaster();
        myToaster.plugIn(); // Inherited from the abstract class
        myToaster.toast();
    }
}