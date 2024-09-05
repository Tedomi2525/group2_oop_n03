package ReusingClasses.InterfacesExercise12;

class Component1 {
	Component1(String message) {
		System.out.println("Component1 constructor: " + message);
	}

	void dispose() {
		System.out.println("Disposing Component1");
	}
}

class Component2 {
	Component2(String message) {
		System.out.println("Component2 constructor: " + message);
	}

	void dispose() {
		System.out.println("Disposing Component2");
	}
}

class Component3 {
	Component3(String message) {
		System.out.println("Component3 constructor: " + message);
	}

	void dispose() {
		System.out.println("Disposing Component3");
	}
}

class Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Root(String message) {
		c1 = new Component1("Root");
		c2 = new Component2("Root");
		c3 = new Component3("Root");
		System.out.println("Root constructor: " + message);
	}

	void dispose() {
		System.out.println("Disposing Root");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}

class Stem extends Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Stem(String message) {
		super("Stem's Root part");
		c1 = new Component1("Stem");
		c2 = new Component2("Stem");
		c3 = new Component3("Stem");
		System.out.println("Stem constructor: " + message);
	}

	@Override
	void dispose() {
		System.out.println("Disposing Stem");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
	}
}

public class bTap12 {
	public static void main(String[] args) {
		Stem stem = new Stem("Creating a Stem object");
		try {
		} finally {
			stem.dispose();
		}
	}
}

//Component1 constructor: Root
//Component2 constructor: Root
//Component3 constructor: Root
//Root constructor: Stem's Root part
//Component1 constructor: Stem
//Component2 constructor: Stem
//Component3 constructor: Stem
//Stem constructor: Creating a Stem object
//Disposing Stem
//Disposing Component3
//Disposing Component2
//Disposing Component1
//Disposing Root
//Disposing Component3
//Disposing Component2
//Disposing Component1

