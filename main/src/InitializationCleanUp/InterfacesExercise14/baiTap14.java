package InitializationCleanUp.InterfacesExercise14;

public class baiTap14 {

    // Trường static được khởi tạo tại điểm khai báo
    static String field1 = "Initialized at declaration";

    // Trường static khác được khởi tạo trong khối khởi tạo static
    static String field2;

    // Khối khởi tạo static
    static {
        field2 = "Initialized in static block";
    }

    // Phương thức static để in ra giá trị của các trường
    static void printFields() {
        System.out.println("field1: " + field1);
        System.out.println("field2: " + field2);
    }

    public static void main(String[] args) {
        // Gọi phương thức static để in ra giá trị của các trường
        printFields();
    }
}
//field1: Initialized at declaration
//field2: Initialized in static block
//biến static sẽ lấy bộ nhớ chỉ một lần, nếu bất cứ đối tượng nào thay đổi giá trị 
//của biến static, nó sẽ vẫn ghi nhớ giá trị của nó.

//Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.