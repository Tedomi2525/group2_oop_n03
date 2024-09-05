package ReusingClasses.InterfacesExercise23;

class SampleClass {
    static {
        System.out.println("Static block of SampleClass");
    }

    {
        System.out.println("Instance block of SampleClass");
    }

    public SampleClass() {
        System.out.println("Constructor of SampleClass");
    }

    public static void staticMethod() {
        System.out.println("Static method of SampleClass");
    }
}

//Thực Thi Khối Static: Khối static chỉ được in ra một lần, 
//cho thấy lớp chỉ được tải vào bộ nhớ một lần

//Truy cập phương thức static staticMethod() 
//sẽ kích hoạt việc tải lớp nếu lớp chưa được tải vào bộ nhớ.