interface Vehicle{
	void wheels();
	void start();
	void move();
	void stop();
}
abstract class MyVehicle implements Vehicle{
	public void start() {
		System.out.println("start...");
	}
	public void move() {
		System.out.println("move...");
		
	}
	public void stop() {
		System.out.println("stop...");
	}
	public abstract void wheels();
	
}
class bike extends MyVehicle{
	public void wheels() {
		System.out.println("2-wheels");
	}
}
class Car extends MyVehicle{
	public void wheels() {
		System.out.println("4-wheels");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b = new bike();
		b.wheels();
		b.start();
		b.move();
		b.stop();
		System.out.println("----------------------------");
		Car c = new Car();
		c.wheels();
		c.start();
		c.move();
		c.stop();
	}

}

