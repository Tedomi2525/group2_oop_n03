package midterm1;

// Lớp DiscreteSignal kế thừa Signal
public class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double speed; // Vận tốc truyền sóng

    // Constructor
    public DiscreteSignal(double amplitude, double frequency, double period, double speed) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.speed = speed;
    }

    // Triển khai các phương thức từ giao diện Signal
    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return speed / frequency; // Công thức tính bước sóng
    }

    @Override
    public String getSignalType() {
        return "Discrete Signal";
    }

    @Override
    public void describe() {
        System.out.println("This is a discrete signal with amplitude: " + amplitude +
                           ", frequency: " + frequency +
                           ", period: " + period +
                           ", and wavelength: " + getWavelength());
    }
}
