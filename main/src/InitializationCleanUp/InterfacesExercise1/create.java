package InitializationCleanUp.InterfacesExercise1;

public class create {
	
	private String value;
	
	public void param() {
		System.out.println("Gia tri cua String: " + value);
	}
	
	public static void main(String[] args) {
		create example = new create();
		example.param();
	}
}

// Biến value được khai báo nhưng không được khởi tạo (không có giá trị gán ban đầu).
// Khi bạn chạy chương trình, Java sẽ tự động khởi tạo biến tham chiếu String này thành null.
// Phương thức param in ra giá trị của value, và kết quả sẽ là null.
