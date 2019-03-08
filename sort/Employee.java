package sort;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	float salary;

	public Employee() {

	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("Comparable");
		if (this.id < o.id)
			return -1;
		else if (this.id > o.id)
			return 1;
		return 0;
	}
}