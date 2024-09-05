package ReusingClasses.InterfacesExercise19;

class FinalReferenceDemo {
	private final String finalReference;

	public FinalReferenceDemo(String value) {
		this.finalReference = value;
	}

	public void printFinalReference() {
		System.out.println("Final reference: " + finalReference);
	}
}

public class btap19 {
	public static void main(String[] args) {
		FinalReferenceDemo demo1 = new FinalReferenceDemo("First Initialization");
		FinalReferenceDemo demo2 = new FinalReferenceDemo("Second Initialization");

		demo1.printFinalReference();
		demo2.printFinalReference();

		FinalReferenceDemo demo3 = new FinalReferenceDemo("Third Initialization");
		demo3.printFinalReference();
	}
}

//Final reference: First Initialization
//Final reference: Second Initialization
//Final reference: Third Initialization
