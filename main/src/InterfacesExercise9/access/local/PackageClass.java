package InterfacesExercise9.access.local;

public class PackageClass {
	private PackageClass() {
		System.out.println("Creating a packaged class");
	}
// Ngăn đối tượng tạo ở bên ngoài và sử dụng phương thức tĩnh để
// tạo và trả đối tượng mới của lớp
	
	public static PackageClass create() {
		return new PackageClass();
	}
}