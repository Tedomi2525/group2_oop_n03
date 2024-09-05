package ReusingClasses.InterfacesExercise23;

public class Main {
    public static void main(String[] args) {
        SampleClass.staticMethod();

        SampleClass instance1 = new SampleClass();
        
        SampleClass instance2 = new SampleClass();
    }
}

//Static block of SampleClass
//Static method of SampleClass
//Instance block of SampleClass
//Constructor of SampleClass
//Instance block of SampleClass
//Constructor of SampleClass