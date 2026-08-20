public class FinalVariable {
    public static void main(String[] args) {
        // Declaring and initializing a final variable
        final int MAX_SPEED = 120;
        
        System.out.println("The speed limit is " + MAX_SPEED + " km/h.");
        
        // Uncommenting the line below will cause a compilation error:
        // MAX_SPEED = 150; 
    }
}