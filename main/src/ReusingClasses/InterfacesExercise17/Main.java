package ReusingClasses.InterfacesExercise17;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();

        Amphibian amphibian = frog;

        amphibian.swim();  
        amphibian.jump(); 
        amphibian.speak();
    }
}

//Frog is swimming
//Frog is jumping
//Frog is croaking