package ReusingClasses.InterfacesExercise16;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();

        Amphibian amphibian = frog;

        amphibian.swim();  
        amphibian.jump(); 
        amphibian.speak();
    }
}

//Amphibian is swimming
//Amphibian is jumping
//Frog is croaking
