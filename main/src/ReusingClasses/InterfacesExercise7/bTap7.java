package ReusingClasses.InterfacesExercise7;

class A {
	A(String message) {
		System.out.println("Constructor of class A: " + message);
	}
}

class B {
	B(int number) {
		System.out.println("Constructor of class B: " + number);
	}
}

class C extends A {
	B b;

// Constructor of class C
	C(String message, int number) {
		super(message); // Call constructor of A
		b = new B(number); // Initialize the member of class B
		System.out.println("Constructor of class C");
	}

	public static void main(String[] args) {
		System.out.println("Creating an object of class C:");
		C c = new C("Hello from A", 42);
	}
}
/*
 * Output: Creating an object of class C: 
 * Constructor of class A: Hello from A
 * Constructor of class B: 42 
 * Constructor of class C
 */
