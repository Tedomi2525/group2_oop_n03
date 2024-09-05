package InitializationCleanUp.InterfacesExercise15;

public class bTap15 {

    // Trường String được khởi tạo bằng khối khởi tạo thể hiện
    String message;

    // Khối khởi tạo thể hiện
    {
        message = "Initialized using instance initialization";
    }

    // Constructor mặc định
    bTap15() {
        // Constructor có thể chứa mã thêm nếu cần
        System.out.println("Constructor executed");
    }

    // Phương thức để in giá trị của trường
    void printMessage() {
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        // Tạo đối tượng InstanceInitializationExample
        bTap15 example = new bTap15();
        // Gọi phương thức để in ra giá trị của trường
        example.printMessage();
    }
}

//Constructor executed
//message: Initialized using instance initialization
