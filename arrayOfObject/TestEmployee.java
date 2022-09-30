package arrays;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee();
			System.out.println("Enter id, name and salary.");
			employees[i].id = s.nextInt();
			employees[i].name = s.next();
			employees[i].salary = s.nextFloat();
		}
		
		for (Employee employee:employees) {
			employee.print();
		}
		
	}

}
