package simple;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = scan.nextInt();
		
		System.out.println("Enter name");
		String name = scan.next();
		
		System.out.println("Enter salary");
		float salary = scan.nextFloat();
		
		Employee e = new Employee(id, name, salary);
		
		e.print();	
	}	
}
