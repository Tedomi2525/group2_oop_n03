package InitializationCleanUp.InterfacesExercise4;

class bird {
	public bird() {
		System.out.println("Day la thong bao");
	}
	
	public bird(String annouce) {
		System.out.println("Day la thong bao den: "+annouce);
	}
}

public class BaiTap4 {
	public static void main(String[] args) {
		bird b = new bird();
		bird a = new bird("Phong luc luong chuc nang");
	}
}

//Trong main():

//Đầu tiên, bạn tạo một đối tượng b sử dụng constructor mặc định, 
//sẽ kích hoạt constructor không có tham số.
//Sau đó, bạn tạo một đối tượng a sử dụng constructor overloading,
//sẽ in ra thông điệp được truyền vào.