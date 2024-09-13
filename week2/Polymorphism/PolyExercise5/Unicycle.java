package PolyExercise5;

public class Unicycle extends Cycle {
    @Override
    int wheels(){
        return 1;
    }
    @Override
    void cycle(){
        System.out.println("Riding a unicycle with " + wheels() + " wheel.");
    }
}
