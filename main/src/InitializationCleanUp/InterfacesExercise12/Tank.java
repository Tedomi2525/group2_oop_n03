package InitializationCleanUp.InterfacesExercise12;

public class Tank {
    private boolean isFull;

    // Constructor
    public Tank() {
        this.isFull = false;
    }

    // Đổ đầy bể
    public void fill() {
        isFull = true;
        System.out.println("Tank is now full.");
    }

    // Làm rỗng bể
    public void empty() {
        isFull = false;
        System.out.println("Tank is now empty.");
    }

    // Phương thức finalize() kiểm tra điều kiện kết thúc
    @Override
    protected void finalize() {
        if (isFull) {
            System.out.println("Error: Tank was not empty during cleanup!");
        } else {
            System.out.println("Tank was empty during cleanup. No issues.");
        }
    }

    public static void main(String[] args) {
        // Scenario 1: Bể được làm rỗng trước khi đối tượng bị thu hồi
        Tank tank1 = new Tank();
        tank1.fill();
        tank1.empty();
        tank1 = null;
        System.gc();  // Yêu cầu garbage collector

        // Scenario 2: Bể không được làm rỗng trước khi đối tượng bị thu hồi
        Tank tank2 = new Tank();
        tank2.fill();
        tank2 = null;
        System.gc();  // Yêu cầu garbage collector

        // Đảm bảo finalize() có thời gian để thực thi
        System.runFinalization();
    }
}
// Luon co null o doi tuong khi co finalize
