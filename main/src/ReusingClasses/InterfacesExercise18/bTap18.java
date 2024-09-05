package ReusingClasses.InterfacesExercise18;

public class bTap18 {
    // Static final field
    public static final int STATIC_FINAL_FIELD = 100;

    // Final field
    public final int finalField;

    public bTap18(int value) {
        this.finalField = value;
    }

    public void printFields() {
        System.out.println("Static final field: " + STATIC_FINAL_FIELD);
        System.out.println("Final field: " + finalField);
    }

    public static void main(String[] args) {
        System.out.println("Accessing static final field directly: " + bTap18.STATIC_FINAL_FIELD);

        bTap18 obj1 = new bTap18(200);
        bTap18 obj2 = new bTap18(300);

        obj1.printFields();
        obj2.printFields();
    }
}


//Accessing static final field directly: 100
//Static final field: 100
//Final field: 200
//Static final field: 100
//Final field: 300
