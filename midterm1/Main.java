package midterm1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amplitude for Discrete Signal:");
        double discreteAmplitude = scanner.nextDouble();

        System.out.println("Enter frequency for Discrete Signal (Hz):");
        double discreteFrequency = scanner.nextDouble();

        System.out.println("Enter period for Discrete Signal (seconds):");
        double discretePeriod = scanner.nextDouble();

        System.out.println("Enter speed of wave propagation for Discrete Signal (m/s):");
        double discreteSpeed = scanner.nextDouble();

        Signal discreteSignal = new DiscreteSignal(discreteAmplitude, discreteFrequency, discretePeriod, discreteSpeed);
        System.out.println("Type: " + discreteSignal.getSignalType());
        discreteSignal.describe();

        System.out.println("\nEnter amplitude for Continuous Signal:");
        double continuousAmplitude = scanner.nextDouble();

        System.out.println("Enter frequency for Continuous Signal (Hz):");
        double continuousFrequency = scanner.nextDouble();

        System.out.println("Enter period for Continuous Signal (seconds):");
        double continuousPeriod = scanner.nextDouble();

        System.out.println("Enter speed of wave propagation for Continuous Signal (m/s):");
        double continuousSpeed = scanner.nextDouble();

        Signal continuousSignal = new ContinuousSignal(continuousAmplitude, continuousFrequency, continuousPeriod, continuousSpeed);
        System.out.println("Type: " + continuousSignal.getSignalType());
        continuousSignal.describe();

        scanner.close();
    }
}
