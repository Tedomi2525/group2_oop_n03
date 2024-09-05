package InitializationCleanUp.InterfacesExercise8;

public class baiTap8 {
	public void firstMethod() {
		System.out.println("meo");
	}
	
	public void secondMethod() {
		firstMethod();
		
		this.firstMethod();
	}
	
	public static void main(String[] args) {
		baiTap8 exp = new baiTap8();
		
		exp.secondMethod();
	}
}
// giong nhau nhung ma this de xac dinhvoi chinh doi tuong hien tai