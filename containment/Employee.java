package containment;

public class Employee {

	private int id;
	private String name;
	private float salary;

	private Address address;

	public Employee() {

	}

	public Employee(int id, String name, float salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
		address.printAddress();
	}

}
