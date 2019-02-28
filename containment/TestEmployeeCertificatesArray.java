package containment;

import java.util.Scanner;

public class TestEmployeeCertificatesArray {

	public static void main(String[] args) {

		EmployeeCertificates e = new EmployeeCertificates();
		Address a = new Address();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter id,name and salary");
		e.setId(scan.nextInt());
		e.setName(scan.next());
		e.setSalary(scan.nextFloat());

		System.out.println("Enter city, state and pincode");
		a.setCity(scan.next());
		a.setState(scan.next());
		a.setPincode(scan.next());

		System.out.println("Enter address line");
		scan.nextLine();
		a.setLine(scan.nextLine());

		System.out.println("Enter number of certificates");
		Certificate[] c = new Certificate[scan.nextInt()];

		for (int i = 0; i < c.length; i++) {
			System.out.println("Enter details for certificate: " + (i + 1));
			
			Certificate temp = new Certificate();
			
			System.out.println("Enter certificate name");
			temp.setName(scan.next());

			System.out.println("Enter certificate issuer name");
			temp.setIssuerName(scan.next());

			System.out.println("Enter certificate grade");
			temp.setGrade(scan.next());
			
			c[i] = temp;

		}

		e.setAddress(a);
		e.setCertificate(c);
		e.printEmployee();
	}

}
