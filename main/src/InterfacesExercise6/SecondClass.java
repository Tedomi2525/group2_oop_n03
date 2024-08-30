package InterfacesExercise6;

class FirstClass{
	protected int protectedData = 10;
}

public class SecondClass {

	public void modifyData(FirstClass obj) {
        obj.protectedData = 20; // Thay đổi giá trị của protectedData
        System.out.println("Protected data after modification: " + obj.protectedData);
    }

    public static void main(String[] args) {
        FirstClass firstObj = new FirstClass();
        SecondClass secondObj = new SecondClass();

        // Hiển thị giá trị ban đầu của protectedData
        System.out.println("Protected data before modification: " + firstObj.protectedData);

        // Gọi phương thức để thay đổi protectedData
        secondObj.modifyData(firstObj);
    }
}

// Bảo vệ: Dữ liệu protected có thể được truy cập trong cùng một lớp
// , các lớp con, và các lớp khác trong cùng một gói, nhưng không thể truy cập từ các lớp khác 
// bên ngoài gói nếu không thông qua kế thừa.