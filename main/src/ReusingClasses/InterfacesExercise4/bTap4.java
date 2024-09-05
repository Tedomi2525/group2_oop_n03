package ReusingClasses.InterfacesExercise4;

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

class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		System.out.println("Creating a Cartoon object:");
		Cartoon x = new Cartoon();
	}
}
/*
 * Output: Creating a Cartoon object: 
 * Art constructor 
 * Drawing constructor
 * Cartoon constructor
 * 
 * Lop co so duoc uu tien goi truoc 
 * xong den lop trung gian roi den lop dan xuat
 * ham main thi theo thu tu uu tien cua cac dong 
 * 
 * (a) Constructor của lớp cơ sở luôn luôn được gọi.
 *	(b) Nó được gọi trước constructor của lớp dẫn xuất.
 */
