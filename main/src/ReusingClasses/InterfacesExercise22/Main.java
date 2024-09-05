package ReusingClasses.InterfacesExercise22;

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
        obj.value = 20;
        obj.display();
    }
}


//Value: 10
//Value: 20