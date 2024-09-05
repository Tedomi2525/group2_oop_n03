package InitializationCleanUp.InterfacesExercise17;

public class bTap17 {

    // Constructor nhận tham số kiểu String và in ra tham số
    bTap17(String message) {
        System.out.println("Constructor called with message: " + message);
    }

    public static void main(String[] args) {
        // Tạo một mảng các tham chiếu đối tượng của ExampleClass
        bTap17[] array = new bTap17[5];

        // Mảng đã được khai báo, nhưng không có đối tượng nào được khởi tạo

        // Chạy chương trình và kiểm tra xem constructor có được gọi không
        System.out.println("Array of ExampleClass created but not initialized.");
    }
}

// Array of ExampleClass created but not initialized.