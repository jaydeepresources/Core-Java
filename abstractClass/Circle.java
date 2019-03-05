package abstractClass;

public class Circle extends Shape {

	float radius;

	public Circle() {

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void findArea() {
		area = 3.14f * radius * radius;
	}

	@Override
	public void printShape() {
		System.out.println("Radius= " + radius);
		super.printShape();
	}

}
