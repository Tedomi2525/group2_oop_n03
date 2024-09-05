package InitializationCleanUp.InterfacesExercise3;

class bird {
	public bird() {
		System.out.println("Day la thong bao");
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		bird b = new bird();
	}
}

// Lop bird co 1 constructor mac dinh tuc la constructor khong co tham so
// Khi doi tuong duoc tao ra thong bao se duoc in ra

// trong phuong thuc main ban tao 1 doi tuong cua lop bird bang cach goi new bird 
// dieu nay se lam kich hoat constructor mac dinh va thong bao duoc in ra man hinh
