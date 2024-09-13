package group2_oop_n03.midterm1;

class ContinuousSignal implements Signal {
    @Override
    public double calculateSignal(int n) {
        // Continuous signal example: amplitude A, frequency f, time t
        double A = 1.0;  // Amplitude
        double f = 0.1;  // Frequency (in Hz)
        double t = n;    // Time is treated as n in this example

        // Continuous signal formula: A * sin(2 * pi * f * t)
        return A * Math.sin(2 * Math.PI * f * t);
    }
}
