package InitializationCleanUp.InterfacesExercise9;

public class baiTap9 {

	public baiTap9(String message) {
		System.out.println("Day la thong bao: " +message);
	}
	
	public baiTap9() {
		this("Default");
		System.out.println("Day la constructor thu 2");
	}
	
	public static void main(String[] args) {
		baiTap9 bt = new baiTap9();
	}
}

//Constructor có tham số: Nhận một chuỗi message và in ra thông báo.
//Constructor mặc định: Không nhận tham số. 
//Khi được gọi, nó sử dụng từ khóa this để gọi constructor có tham số,
//với tham số là một chuỗi mặc định "Default"
//nếu constructor 1 được gọi thì phải truyền tham số vào baiTap9()

//Không thể gọi 2 constructor giống y hệt nhau trong class
