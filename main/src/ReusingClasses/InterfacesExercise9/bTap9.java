package ReusingClasses.InterfacesExercise9;

class Component1 {
	Component1() {
		System.out.println("Component1 is created");
	}
}

class Component2{
	Component2() {
		System.out.println("Component2 is created");
	}
}

class Component3{
	Component3() {
		System.out.println("Component3 is created");
	}
}

class Root{
	Component1 cn1 = new Component1();
	Component2 cn2 = new Component2();
	Component3 cn3 = new Component3();
	
	Root() {
		System.out.println("Root constructor");
	}
}

class Stem extends Root{
	Component1 cn1 = new Component1();
	Component2 cn2 = new Component2();
	Component3 cn3 = new Component3();
	
	Stem() {
		System.out.println("Stem constructor");
	}
}

public class bTap9{
	public static void main(String[] args) {
		Stem stem = new Stem();
	}
}

//Component1 is created
//Component2 is created
//Component3 is created
//Root constructor
//Component1 is created
//Component2 is created
//Component3 is created
//Stem constructor

