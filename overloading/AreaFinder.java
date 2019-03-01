package overloading;

public class AreaFinder {

	public void findArea(float radius) {
		System.out.println("Area of Circle= " + 3.14f * radius * radius);
	}
	
	public void findArea(int side) {
		System.out.println("Area of Square= " + side * side);
	}
	
	public void findArea(int length, int breadth) {
		System.out.println("Area of Rectangle= " + length * breadth);
	}

}
