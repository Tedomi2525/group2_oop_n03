package ReusingClasses.InterfacesExercise10;

class Component1 {
	Component1(String message){
		System.out.println("Component1: "+message);
	}
}

class Component2 {
	Component2(String message){
		System.out.println("Component2: "+message);
	}
}
class Component3 {
	Component3(String message){
		System.out.println("Component3: "+message);
	}
}

class Root{
	Component1 c1 = new Component1("Root");
	Component2 c2 = new Component2("Root");
	Component3 c3 = new Component3("Root");
	Root(){
		System.out.println("Root constructor");
	}
}

class Stem extends Root{
	Component1 c1 = new Component1("Root");
	Component2 c2 = new Component2("Root");
	Component3 c3 = new Component3("Root");
	Stem(){
		System.out.println("Stem constructor");
	}
}

public class bTap10{
	public static void main(String[] args) {
		Stem stem = new Stem();
	}
}

//Component1: Root
//Component2: Root
//Component3: Root
//Root constructor
//Component1: Root
//Component2: Root
//Component3: Root
//Stem constructor
