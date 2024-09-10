package midterm2;

public class DiscreteSignal implements Signal {

    // Dirac delta function: returns 1 if n is 0, otherwise returns 0
    private int delta(int n) {
        return n == 0 ? 1 : 0;
    }

    // Calculate the discrete signal based on the formula x(n)
    @Override
    public double calculateSignal(int n) {
        double result = 0;
        // Assume x(k) is defined for k in the range -10 to 10
        for (int k = -10; k <= 10; k++) {
            result += x(k) * delta(n - k);
        }
        return result;
    }

    // Define the x(k) function: here, using sin(k) as an example
    private double x(int k) {
        return Math.sin(k);
    }
}
