package ReusingClasses.InterfacesExercise17;

class Frog extends Amphibian {
    @Override
    public void swim() {
        System.out.println("Frog is swimming");
    }

    @Override
    public void jump() {
        System.out.println("Frog is jumping");
    }

    @Override
    public void speak() {
        System.out.println("Frog is croaking");
    }
}

