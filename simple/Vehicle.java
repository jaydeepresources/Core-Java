package simple;

public class Vehicle {

	String name;
	String color;
	float speed;

	public Vehicle() {
	}

	public Vehicle(String name, String color, float speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	public void print() {
		System.out.println("Name= " + name);
		System.out.println("Color= " + color);
		System.out.println("Speed= " + speed);
	}

	public void accelerate() {
		System.out.println("Speed increased");
	}

}
