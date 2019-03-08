package bounded;

public class TestBounded {

	public static void main(String[] args) {
		
		ServiceCenter<Car> sc1 = new ServiceCenter<Car>(new Car());
		sc1.printServiceCenter();
		
		ServiceCenter<Bike> sc2 = new ServiceCenter<Bike>(new Bike());
		sc2.printServiceCenter();
		
	}

}
