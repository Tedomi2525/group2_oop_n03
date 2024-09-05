package ReusingClasses.InterfacesExercise8;

class Base {
	Base(String message) {
		System.out.println("Base class constructor: " + message);
	}
}

class Derived extends Base {
	Derived() {
		super("Default message from Derived"); // Calling base-class constructor
		System.out.println("Derived class default constructor");
	}

	Derived(String customMessage) {
		super(customMessage); // Calling base-class constructor with a custom message
		System.out.println("Derived class non-default constructor");
	}

	public static void main(String[] args) {
		System.out.println("Creating an object with the default constructor of Derived:");
		Derived d1 = new Derived(); // Calls default constructor of Derived

		System.out.println("\nCreating an object with the non-default constructor of Derived:");
		Derived d2 = new Derived("Custom message from Derived"); // Calls non-default constructor
	}
}
/*
 * Output: Creating an object with the default constructor of Derived: Base
 * class constructor: Default message from Derived Derived class default
 * constructor
 * 
 * Creating an object with the non-default constructor of Derived: Base class
 * constructor: Custom message from Derived Derived class non-default
 * constructor
 */
