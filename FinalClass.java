// Declaring a class as final
final class SecureSystem {
    void displayStatus() {
        System.out.println("Secure system is running.");
    }
}

// Uncommenting the lines below will cause a compilation error:
// class HackSystem extends SecureSystem { 
// }

public class FinalClass {
    public static void main(String[] args) {
        SecureSystem sys = new SecureSystem();
        sys.displayStatus();
    }
}