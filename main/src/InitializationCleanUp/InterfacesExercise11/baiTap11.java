package InitializationCleanUp.InterfacesExercise11;

public class baiTap11 {
    
    // Phương thức finalize() in ra thông báo
    @Override
    protected void finalize() {
        System.out.println("MyClass object is being garbage collected.");
    }

    public static void main(String[] args) {
        // Tạo đối tượng MyClass
        baiTap11 obj = new baiTap11();
        
        // Đặt obj thành null để đối tượng này có thể bị garbage collected
        obj = null;
        
        // Yêu cầu garbage collector thực hiện thu hồi bộ nhớ
        System.gc();
        
        // Đảm bảo finalize() có thời gian để thực thi
        System.runFinalization();

        // Thêm một khoảng trễ để đảm bảo rằng finalize() được gọi
        try {
            Thread.sleep(1000); // Ngủ 1 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

