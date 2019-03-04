package simple;

public class Car extends Vehicle {

	String gearType;

	public Car() {
	}
	
	public Car(String name, String color, float speed,String gearType) {
		super(name, color, speed);
		this.gearType = gearType;
	}

	public void print() {
		super.print();
		System.out.println("Gear Type= " + gearType);
	}

	public void accelerate() {
		speed += 5;
		System.out.println("Speed increased by 5km/hr= " + speed);
	}
}