package containment;

import java.util.Scanner;

public class TestEmployeeAddress {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Employee e = new Employee();
		Address a = new Address();
		
		System.out.println("Enter id,name and salary");
		e.setId(scan.nextInt()) ;
		e.setName(scan.next());
		e.setSalary(scan.nextFloat());
		
		System.out.println("Enter city, state and pincode");
		a.setCity(scan.next());
		a.setState(scan.next());
		a.setPincode(scan.next());
		 
		System.out.println("Enter address line");
		scan.nextLine();
		a.setLine(scan.nextLine());
		
		e.setAddress(a);
		
		e.printEmployee();
	}
}
