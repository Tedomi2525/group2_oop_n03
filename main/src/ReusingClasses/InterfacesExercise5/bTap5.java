package ReusingClasses.InterfacesExercise5;
class Art {
	Art(){
		System.out.println("art");
	}
}

class Draw{
	Draw(){
		System.out.println("draw");
	}
}

class bTap5 extends Art{
	Draw dr = new Draw();
	public static void main(String[] args) {
		System.out.println("Tao doi tuong bTap5: ");
		bTap5 c = new bTap5();
	}
}

//Đầu tiên, constructor của lớp Art được gọi vì bTap5 kế thừa từ Art.
//Sau đó, constructor của lớp Draw được gọi khi thành viên Draw của lớp bTap5 được khởi tạo.

//Tao doi tuong bTap5: 
//art
//draw