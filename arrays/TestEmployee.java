package arrays;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Employees");
		int n = scan.nextInt();

		Employee[] employees = new Employee[n];

		for (int i = 0; i < employees.length; i++) {

			System.out.println("Enter information for employee " + (i + 1));

			System.out.println("Enter id");
			int id = scan.nextInt();

			System.out.println("Enter name");
			String name = scan.next();

			System.out.println("Enter salary");
			float salary = scan.nextFloat();

			Employee e = new Employee(id, name, salary);
			employees[i] = e;
		}

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Displaying information for employee " + (i + 1));
			employees[i].print();
		}

	}
}
