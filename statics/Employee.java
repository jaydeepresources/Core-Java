package simple;

public class Employee {

	int id;
	String name;
	float salary;
	static int count;
	
	Employee(){
		count++;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}
}