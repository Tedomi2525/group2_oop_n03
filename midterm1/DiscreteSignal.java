package group2_oop_n03.midterm1;

// Lớp DiscreteSignal kế thừa Signal
public class DiscreteSignal implements Signal {
    private int delta(int n) {
        return n == 0 ? 1 : 0;
    }
    @Override
    public double calculateSignal(int n) {
        double result = 0;
        // Giả sử x(k) được định nghĩa trong phạm vi từ -10 đến 10
        for (int k = -10; k <= 10; k++) {
            result += x(k) * delta(n - k);
        }
        return result;
    }

    // Định nghĩa hàm x(k): sử dụng sin(k) làm ví dụ
    private double x(int k) {
        return Math.sin(k);
    }
}