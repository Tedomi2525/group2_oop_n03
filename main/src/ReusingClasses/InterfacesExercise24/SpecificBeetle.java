package ReusingClasses.InterfacesExercise24;

public class SpecificBeetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public SpecificBeetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		SpecificBeetle b = new SpecificBeetle();
	}
}


//static Beetle.x2 initialized
//Beetle constructor
//i = 9, j = 0
//Beetle.k initialized
//k = 47
//j = 39