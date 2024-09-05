package InitializationCleanUp.InterfacesExercise2;

public class Exercise2 {

	private String lastName = "Quan";
	
	private String firstName;
	
	public void param(String value){
		this.firstName = value;
	}
	
	public void PrintString() {
		System.out.println("Ho: " + firstName);
		System.out.println("Ten: " + lastName);
	}
	
	public static void main(String[] args) {
		Exercise2 exp = new Exercise2();
		exp.param("Hoang");
		exp.PrintString();
	}
}
// Khởi tạo tại điểm khai báo: Biến được gán giá trị ngay lập tức khi được khai báo. 
// Điều này giúp bạn có thể chắc chắn rằng biến luôn có giá trị mặc định, 
// phù hợp cho các trường hợp bạn muốn đảm bảo biến luôn được khởi tạo với một giá trị cố định.

// Khởi tạo trong constructor: Biến chỉ được gán giá trị khi đối tượng 
// được tạo ra thông qua constructor. Cách này linh hoạt hơn vì bạn có thể thay đổi giá trị của biến
// dựa trên các tham số được truyền vào khi khởi tạo đối tượng. 
// Điều này phù hợp cho các tình huống mà giá trị của biến cần phải tùy chỉnh theo từng trường hợp 
// cụ thể.
