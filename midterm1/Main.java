package group2_oop_n03.midterm1;

public class Main {
    public static void main(String[] args) {
        // Create and test the DiscreteSignal
        Signal discreteSignal = new DiscreteSignal();
        int testPoint = 4;
        System.out.println("DiscreteSignal at n = " + testPoint + ": " + discreteSignal.calculateSignal(testPoint));

        // Create and test the Radar signal
        Signal radarSignal = new Radar();
        for (int n = 0; n <= 15; n++) {
            System.out.println("RadarSignal at n = " + n + ": " + radarSignal.calculateSignal(n));
        }
    }
}

