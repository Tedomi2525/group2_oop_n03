package ReusingClasses.InterfacesExercise1;

class SecondClass {
    private bTap1 simpleObject;

    // Lazy initialization of simpleObject
    public bTap1 getSimpleObject() {
        if (simpleObject == null) {  // Check if the object is already instantiated
            simpleObject = new bTap1("Ao that day");
        }
        return simpleObject;
    }
    
    public static void main(String[] args) {
		SecondClass sc = new SecondClass();
		
		System.out.println("ghi message");

        sc.getSimpleObject().displayMessage();
        
        sc.getSimpleObject().displayMessage();
	}
}
