package simple;

public class TestVehicle {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.name = "City";
		c.color = "Black";
		c.speed = 20;
		c.gearType = "Auto";
		
		c.print();
		
		Car cPar = new Car("City","Black",20,"Auto");
		cPar.print();
	}
}
