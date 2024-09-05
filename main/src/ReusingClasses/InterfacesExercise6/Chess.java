package ReusingClasses.InterfacesExercise6;

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i); // Calls the constructor of Game
		System.out.println("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11); // Calls the constructor of BoardGame
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		System.out.println("Creating a Chess object:");
		Chess x = new Chess();
	}
}
/*
 * Output: Creating a Chess object: 
 * Game constructor 
 * BoardGame constructor 
 * Chess constructor
 */
