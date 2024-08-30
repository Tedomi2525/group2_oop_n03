package InterfacesExercise9.access.foreign;

import InterfacesExercise9.access.local.PackageClass;

public class Foreign {
	public static void main(String[] args) {
		// PackagedClass pc = new PackagedClass();
		// nếu phương thức này thực hiện trong package access.local thì mới có thể truy cập
		PackageClass pc = PackageClass.create();
	}
}

// Khi bạn biên dịch lớp Foreign, trình biên dịch sẽ tạo ra lỗi. 
// Lý do là vì lớp PackagedClass được khai báo với mức độ truy cập mặc định (default)
//, tức là chỉ có thể truy cập được từ trong cùng một gói (package). 
// Điều này có nghĩa là chỉ các lớp khác trong gói access.local mới có thể sử dụng lớp PackagedClass

