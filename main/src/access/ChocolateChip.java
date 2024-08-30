package access;

import access.cookie2.Cookie;

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		// bite(); Không thể truy cập neu khong co extends
	}

	public void chomp1() {
		test();
	}

	public void chomp2() {
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
		x.chomp1();
	}
}
// Chỉ có thể truy cập khi được kế thừa từ class chứa hàm protected và có mehthod protected riêng biệt
// Private thì chỉ riêng class đó có thể truy cập
// Protect có thể truy cập thong qua kế thừa
// public thì rộng hơn có thể truy cập bằng extends hoặc không
