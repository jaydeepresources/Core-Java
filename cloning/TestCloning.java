package cloning;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1, "John Doe", 12345.6f);
		
		Employee e2 = (Employee) e1.clone();
		
		e1.print();
		e2.print();

	}

}
