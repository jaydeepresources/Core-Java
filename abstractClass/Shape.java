package abstractClass;

public abstract class Shape {

	String name;
	float area;
	
	public Shape() {
	
	}

	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void findArea();
	
	public void printShape() {
		System.out.println("Name= " + name);
		System.out.println("Area= " + area);
	}
	
}
