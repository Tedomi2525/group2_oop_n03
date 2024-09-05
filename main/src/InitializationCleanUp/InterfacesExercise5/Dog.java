package InitializationCleanUp.InterfacesExercise5;


public class Dog {
		
	public Dog(String value1) {
		System.out.println(value1);
	}
	
	public static void bark(String value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		Dog a = new Dog("Gau");
		a.bark("Grr");
	}
}
