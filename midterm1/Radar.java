package group2_oop_n03.midterm1;

public class Radar implements Signal {

    // Dirac delta function: returns 1 if 0 <= n <= 15, otherwise returns 0
    private int delta(int n) {
        return (n >= 0 && n <= 15) ? 1 : 0;
    }

    // Calculate the radar signal based on the formula X(n)
    @Override
    public double calculateSignal(int n) {
        if (n >= 0 && n <= 15) {
            return (1 - (double)n / 15) * delta(n);
        }
        return 0;
    }
}
