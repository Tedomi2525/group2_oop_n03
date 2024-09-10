package midterm1;

public interface Signal {
    double getAmplitude();  // Lấy giá trị biên độ
    double getFrequency();  // Lấy giá trị tần số
    double getPeriod();     // Lấy giá trị chu kỳ
    double getWavelength(); // Lấy giá trị bước sóng

    String getSignalType(); // Lấy loại tín hiệu (rời rạc hoặc liên tục)
    void describe();        // Mô tả tín hiệu
}
