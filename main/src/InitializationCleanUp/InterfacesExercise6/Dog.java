package InitializationCleanUp.InterfacesExercise6;

public class Dog {
	
	public Dog(String value1) {
		System.out.println(value1);
	}
	
	public static void bark(String value, int volume) {
		System.out.println(value + ", Am luong: " +volume);
	}
	
	public static void bark(int volume, String value) {
		System.out.println(value + ", Am luong: " +volume);
	}
	
	public static void main(String[] args) {
		Dog a = new Dog("Gau");
		a.bark("Grr", 85);
		a.bark(85, "Grr");
	}
}

// dao thu tu van hop le
// --> hoat dong dung cach
