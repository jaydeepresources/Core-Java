package interfaces;

public class TestPrintable {

	public static void main(String[] args) {

		Printer p = new Printer();
		p.print();
		
		Printer pr = new Printer();
		pr.name = "HP Printer";
	}
}
