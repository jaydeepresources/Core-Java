package interfaces;

public class Printer extends Product implements Printable {

	@Override
	public void print() {
		System.out.println("Printing...");
	}
}
