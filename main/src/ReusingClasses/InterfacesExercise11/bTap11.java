package ReusingClasses.InterfacesExercise11;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }
    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}

class Detergent {
    private Cleanser cleanser = new Cleanser();

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.append(" Detergent.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        cleanser.append(" foam()");
    }

    public String toString() {
        return cleanser.toString();
    }
}

public class bTap11{
	public static void main(String[] args) {
	     Detergent x = new Detergent();
	     x.dilute();
	     x.apply();
	     x.scrub();
	     x.foam();
	     System.out.println(x);
	}
}

// Cleanser dilute() apply() scrub()

