package abstractClass;

public class TestShape {

	public static void main(String[] args) {
		
		Shape c = new Circle("Circle",5.45f);
		c.findArea();
		c.printShape();
	}
}