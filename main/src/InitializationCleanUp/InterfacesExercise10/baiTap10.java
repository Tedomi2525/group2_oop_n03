package InitializationCleanUp.InterfacesExercise10;

public class baiTap10 {

	protected void finalize() {
		System.out.println("My obj is being garbage collected");
	}
	
	public static void main(String[] args) {
		baiTap10 bt10 = new baiTap10();
		bt10 = null;
		
		System.gc();
		
		System.runFinalization();
	}
}

// Phương thức finalize(): Được ghi đè từ lớp Object.
// Khi phương thức này được gọi, nó in ra thông báo "My obj is being garbage collected." 
// Điều này thường xảy ra ngay trước khi đối tượng bị thu hồi khỏi bộ nhớ bởi garbage collector.

// Tạo đối tượng MyClass: Đối tượng obj của lớp MyClass được tạo.
// Đặt obj thành null: Điều này khiến đối tượng MyClass không còn được tham chiếu và trở thành "rác", có thể bị garbage collector thu hồi.
// Gọi System.gc(): Đây là một yêu cầu với JVM để thực hiện thu hồi bộ nhớ
// (garbage collection). Tuy nhiên, đây chỉ là một yêu cầu, JVM có thể hoặc không thực hiện 
// garbage collection ngay lập tức.
// Gọi System.runFinalization(): Điều này giúp đảm bảo rằng tất cả các phương thức finalize() 
// đã được thực thi.