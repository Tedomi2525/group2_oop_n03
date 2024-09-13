package PolyExercise1;
// Base class
class Cycle {
    public void ride() {
        System.out.println("Riding a cycle!");
    }
}

// Subclass for Unicycle
class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a unicycle!");
    }
}

// Subclass for Bicycle
class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a bicycle!");
    }
}

// Subclass for Tricycle
class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a tricycle!");
    }
}

public class Main {
    // Method to demonstrate upcasting
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Cycle unicycle = new Unicycle();  // Upcasting to Cycle
        Cycle bicycle = new Bicycle();    // Upcasting to Cycle
        Cycle tricycle = new Tricycle();  // Upcasting to Cycle

        // Demonstrating polymorphism via the ride() method
        unicycle.ride();  // Output: Riding a unicycle!
        bicycle.ride();   // Output: Riding a bicycle!
        tricycle.ride();  // Output: Riding a tricycle!
    }
}
