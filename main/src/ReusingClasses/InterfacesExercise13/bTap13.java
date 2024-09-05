package ReusingClasses.InterfacesExercise13;

class Base {
	public void method() {
		System.out.println("Base method with no arguments");
	}

	public void method(int x) {
		System.out.println("Base method with int: " + x);
	}

	public void method(String s) {
		System.out.println("Base method with String: " + s);
	}
}

class Derived extends Base {
	public void method(int x, String s) {
		System.out.println("Derived method with int and String: " + x + ", " + s);
	}
}

public class bTap13 {
	public static void main(String[] args) {
		Derived derived = new Derived();

		derived.method(); 
		derived.method(5); 
		derived.method("Hello"); 
		derived.method(10, "World"); 
	}
}

//Base method with no arguments
//Base method with int: 5
//Base method with String: Hello
//Derived method with int and String: 10, World