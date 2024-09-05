package ReusingClasses.InterfacesExercise14;

class Engine {
	public void start() {
		System.out.println("Engine started");
	}

	public void rev() {
		System.out.println("Engine revving");
	}

	public void stop() {
		System.out.println("Engine stopped");
	}

	public void service() {
		System.out.println("Engine is being serviced");
	}
}

class Car {
	Engine engine = new Engine();

	public void drive() {
		engine.start();
		engine.rev();
		System.out.println("Car is driving");
		engine.stop();
	}

	public void serviceCar() {
		engine.service();
	}
}

public class bTap14 {
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		car.serviceCar();
	}
}

//Engine started
//Engine revving
//Car is driving
//Engine stopped
//Engine is being serviced