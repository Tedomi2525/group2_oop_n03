package InitializationCleanUp.InterfacesExercise13;

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)
        // static Cups cups1 = new Cups(); 
        // static Cups cups2 = new Cups();
    }
}

/* 
Inside main()
Cup(1)
Cup(2)
f(99) 
*/

//Khi bạn truy cập một biến static hoặc gọi một phương thức static, 
//khối khởi tạo static trong lớp chứa biến đó sẽ được thực thi.
//Khối khởi tạo static chỉ được thực thi một lần, 
//bất kể bạn truy cập thành phần static đó bao nhiêu lần
//hay tạo bao nhiêu đối tượng của lớp chứa thành phần static đó.
//Nếu không có thành phần static nào của lớp được truy cập, 
//khối khởi tạo static sẽ không được thực thi.

