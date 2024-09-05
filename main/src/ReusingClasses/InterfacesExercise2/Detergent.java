package ReusingClasses.InterfacesExercise2;

class Detergent {

	public void scrub() {
		System.out.println("Day la scrub");
	}
	
	public void foam() {
		System.out.println("Day la foam");
	}
}

class Inherit extends Detergent{
	public void scrub() {
		System.out.println("Ke thua scrub");
	}
	
	public void sterilize() {
		System.out.println("sterilize");
	}
}

class Main{
	public static void main(String[] args) {
		Inherit ihr = new Inherit();
			
		ihr.scrub();
		ihr.foam();
		ihr.sterilize();
	}
}
