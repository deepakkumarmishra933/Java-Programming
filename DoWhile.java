public class DoWhile {
    public static void main(String[] args) {
        boolean connectionEstablished = false;
        int attempts = 0;

        do {
            System.out.println("Attempting to connect to WiFi...");
            attempts++;
            if (attempts == 2) {
                connectionEstablished = true; // Simulating a successful connection
            }
        } while (!connectionEstablished && attempts < 3);
    }
}