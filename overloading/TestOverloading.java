package overloading;

import java.util.Scanner;

public class TestOverloading {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		AreaFinder af = new AreaFinder();

		System.out.println("Enter radius");
		af.findArea(scan.nextFloat());

		System.out.println("Enter side");
		af.findArea(scan.nextInt());

		System.out.println("Enter length and breadth");
		af.findArea(scan.nextInt(), scan.nextInt());
	}

}
