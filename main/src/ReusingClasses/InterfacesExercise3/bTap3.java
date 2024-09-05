package ReusingClasses.InterfacesExercise3;

class Art {
	Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

public class bTap3 extends Drawing {
//	public bTap3() {
//		System.out.println("Cartoon constructor");
//	}

	public static void main(String[] args) {
		bTap3 x = new bTap3();
	}
}

// Trong lop bTap3 chung ta khong khai bao 1 constructor
// khi khoi tao doi tuong btap3 trinh bien dich tu dong tao 1 constructor mac dinh cho lop nay 
// Va mac dinh se ko in ra j ca va chi in ra lop Drawing va Art 
// Lop cha uu tien hon lop con 

// Art constructor
// Drawing constructor